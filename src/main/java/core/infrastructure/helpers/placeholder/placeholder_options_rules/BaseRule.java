package core.infrastructure.helpers.placeholder.placeholder_options_rules;

import java.util.List;

abstract public class BaseRule {
    protected final String acronym;

    public BaseRule(String acronym) {
        this.acronym = acronym;
    }

    /**
     * Проверяем, подходит или нет переданная опция для использования в данном классе
     */
    public boolean isSuitable(String placeholderOption) {
        return acronym.equalsIgnoreCase(placeholderOption);
    }

    abstract public String convert(String option, List<String> flags);
}
