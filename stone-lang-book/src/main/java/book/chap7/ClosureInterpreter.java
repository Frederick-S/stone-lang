package book.chap7;

import stone.ClosureParser;
import stone.ParseException;
import book.chap6.BasicInterpreter;

public class ClosureInterpreter extends BasicInterpreter{
    public static void main(String[] args) throws ParseException {
        run(new ClosureParser(), new NestedEnv());
    }
}
