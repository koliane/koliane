package core.infrastructure.helpers.placeholder.placeholder_options_rules;

import java.util.List;

public class UpperCaseRule extends BaseRule {
    private final static String ONLY_FIRST_SYMBOL_FLAG = "FIRST";

    public UpperCaseRule() {
        super("UC");
    }

    @Override
    public String convert(String option, List<String> flags) {
        if(flags.isEmpty()) {
            return option.toUpperCase();
        }

        if( flags.contains(ONLY_FIRST_SYMBOL_FLAG)
            || flags.contains(ONLY_FIRST_SYMBOL_FLAG.toLowerCase())
            || flags.contains(ONLY_FIRST_SYMBOL_FLAG.toUpperCase())
        ) {
            return option.substring(0, 1).toUpperCase() + option.substring(1);
        }

        return option;
    }
}
