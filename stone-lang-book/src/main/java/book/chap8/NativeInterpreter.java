package book.chap8;

import stone.ClosureParser;
import stone.ParseException;
import book.chap6.BasicInterpreter;
import book.chap7.NestedEnv;

public class NativeInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClosureParser(),
            new Natives().environment(new NestedEnv()));
    }
}
