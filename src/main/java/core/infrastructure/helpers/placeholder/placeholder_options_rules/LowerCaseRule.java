package core.infrastructure.helpers.placeholder.placeholder_options_rules;

import java.util.List;
import java.util.Locale;

public class LowerCaseRule extends BaseRule {
    private final static String ONLY_FIRST_SYMBOL_FLAG = "FIRST";

    public LowerCaseRule() {
        super("LC");
    }

    @Override
    public String convert(String option, List<String> flags) {
        if(flags.isEmpty()) {
            return option.toLowerCase();
        }

        if( flags.contains(ONLY_FIRST_SYMBOL_FLAG)
                || flags.contains(ONLY_FIRST_SYMBOL_FLAG.toLowerCase())
                || flags.contains(ONLY_FIRST_SYMBOL_FLAG.toUpperCase())
        ) {
            return option.substring(0, 1).toLowerCase() + option.substring(1);
        }

        return option;
    }
}
