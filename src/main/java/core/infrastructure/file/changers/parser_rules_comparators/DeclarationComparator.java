package core.infrastructure.file.changers.parser_rules_comparators;

import antlr.training.TrainingParser.DeclarationContext;
import org.antlr.v4.runtime.ParserRuleContext;

public class DeclarationComparator extends ParserRulesComparator<DeclarationContext> {
    DeclarationComparator(DeclarationContext ctx1, DeclarationContext ctx2) {
        super(ctx1, ctx2);
    }

//    DeclarationComparator(ParserRuleContext ctx1, ParserRuleContext ctx2) {
//        super(ctx1, ctx2);
//        ctx1 = (TrainingParser.PlaceholderLiteralContext) ctx1;
//    }

    @Override
    public boolean compare() {
//        ctx1.
//        ctx1.initializedIdentifierList().initializedIdentifier().
        return false;
    }
}
