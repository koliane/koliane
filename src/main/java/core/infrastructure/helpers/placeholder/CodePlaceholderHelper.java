package core.infrastructure.helpers.placeholder;

import core.infrastructure.helpers.placeholder.placeholder_options_rules.BaseRule;
import core.infrastructure.helpers.placeholder.placeholder_options_rules.LowerCaseRule;
import core.infrastructure.helpers.placeholder.placeholder_options_rules.SnakeCaseRule;
import core.infrastructure.helpers.placeholder.placeholder_options_rules.UpperCaseRule;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*TODO как нибудь надо будет отрефакторить, т.к. многие методы можно использовать в общем PlaceholderHelper.
    ТОЧНО!! нужно будет рефакторить, если понадобятся опции плейсхолдеров в путях. (сейчас реализовано только в текущем классе)
*/

public class CodePlaceholderHelper extends PlaceholderHelper {
    private static final String PLACEHOLDER_OPTIONS_REGEX =
        "[a-z0-9_"
        + CodePlaceholderOptionConverter.SPLIT_OPTIONS_SYMBOL
        + CodePlaceholderOptionConverter.SPLIT_OPTION_PARTS_SYMBOL
        + CodePlaceholderOptionConverter.SPLIT_OPTION_FLAGS_SYMBOL
        + "]*?";



    public CodePlaceholderHelper() {
        super("#-", "-#");
    }

    public String deleteUnusedPlaceholders(String text, Map<String, String> options) {
        List<String> unusedPlaceholders = new ArrayList<>();
        List<String> placeholders = getPlaceholders(text);

        for(String placeholder: placeholders) {
            String clearedPlaceholder = getClearedPlaceholder(placeholder);
            if(options.get(clearedPlaceholder) == null) {
                unusedPlaceholders.add(placeholder);
            }
        }

        if(unusedPlaceholders.isEmpty()) {
            return text;
        }

        for(String placeholder: unusedPlaceholders) {
            Pattern pattern = Pattern.compile(placeholder + "([ \t],?)?");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                text = matcher.replaceAll("");
            }
        }

        return text;
    }

    @Override
    public String getClearedPlaceholder(String serviceWord) {
        String result = serviceWord.trim();

        result = result.replaceAll("^" + aliasPrefix, "");

        return result.replaceAll("(\\|"+ PLACEHOLDER_OPTIONS_REGEX +")?"+ aliasPostfix + "$", "");
    }

    @Override
    public boolean hasPlaceholder(String text) {
            String defaultSymbolsPattern = PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX + "*";
            Pattern pattern = Pattern.compile(
                    defaultSymbolsPattern
                    + aliasPrefix
                    + defaultSymbolsPattern
                    + "(\\|" + PLACEHOLDER_OPTIONS_REGEX + ")?"
                    + aliasPostfix
                    + defaultSymbolsPattern
            );
            Matcher matcher = pattern.matcher(text);

            return matcher.find();
    }

    @Override
    public List<String> getPlaceholders(String text) {
        String defaultSymbolsPattern = PLACEHOLDER_AVAILABLE_SYMBOLS_REGEX + "*";
        Pattern pattern = Pattern.compile(
                defaultSymbolsPattern
                        + "("
                        + aliasPrefix
                        + defaultSymbolsPattern
                        + "(\\|" + PLACEHOLDER_OPTIONS_REGEX + ")?"
                        + aliasPostfix
                        + ")"
                        + defaultSymbolsPattern
        );
        Matcher matcher = pattern.matcher(text);

        List<String> result = new ArrayList<>();
        while(matcher.find()) {
            result.add(matcher.group(1));
        }

        return result;
    }

    @Override
    public String replaceAllPlaceholders(String text, Map<String, String> options) {
        List<BaseRule> convertRules = new ArrayList<>();
        Collections.addAll(convertRules,
            new LowerCaseRule(),
            new UpperCaseRule(),
            new SnakeCaseRule()
        );

        for(Map.Entry<String, String> pair: options.entrySet()) {
            String optionName = pair.getKey();
            String optionValue = pair.getValue();

            String searcherPattern =
                    aliasPrefix
                    + "(" + optionName + "*" + ")"
                    + "(\\|(" + PLACEHOLDER_OPTIONS_REGEX + "))?"
                    + aliasPostfix;

            Pattern pattern = Pattern.compile(searcherPattern, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);

            String newOptionValue = optionValue;
            String placeholder = "";
            while (matcher.find()) {
                placeholder = matcher.group(0);

                if(matcher.group(3) != null) {
                    String strPlaceholderFlags =  matcher.group(3);
                    CodePlaceholderOptionConverter converter =
                            new CodePlaceholderOptionConverter(optionValue, strPlaceholderFlags, convertRules);

                    newOptionValue = converter.convert();
                }

                text = text.replaceAll(Pattern.quote(placeholder), newOptionValue);
            }
        }

        return text;
    }
}
