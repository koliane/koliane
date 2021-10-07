package core.infrastructure.helpers.placeholder.placeholder_options_rules;

import core.infrastructure.helpers.StringHelper;

import java.util.List;

public class SnakeCaseRule extends BaseRule {
    public SnakeCaseRule() {
        super("SNAKE");
    }

    @Override
    public String convert(String option, List<String> flags) {

        return StringHelper.toSnakeCase(option);
    }
}
