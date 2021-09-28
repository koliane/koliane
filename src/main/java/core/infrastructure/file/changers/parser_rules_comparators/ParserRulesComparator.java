package core.infrastructure.file.changers.parser_rules_comparators;

import org.antlr.v4.runtime.ParserRuleContext;

abstract public class ParserRulesComparator<T extends ParserRuleContext> {
    T ctx1;
    T ctx2;

    ParserRulesComparator(T ctx1, T ctx2) {
        this.ctx1 = ctx1;
        this.ctx2 = ctx2;
    }


//    abstract public boolean compare(ParserRuleContext ctx1, ParserRuleContext ctx2);
    abstract public boolean compare();
}
