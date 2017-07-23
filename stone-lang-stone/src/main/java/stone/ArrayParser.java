package stone;

import static stone.Parser.rule;
import javassist.gluonj.Reviser;
import stone.ast.*;

@Reviser public class ArrayParser extends FuncParser {
    Parser elements = Parser.rule(ArrayLiteral.class)
                          .ast(expr).repeat(Parser.rule().sep(",").ast(expr));
    public ArrayParser() {
        reserved.add("]");
        primary.insertChoice(Parser.rule().sep("[").maybe(elements).sep("]"));
        postfix.insertChoice(Parser.rule(ArrayRef.class).sep("[").ast(expr).sep("]"));
    }
}
