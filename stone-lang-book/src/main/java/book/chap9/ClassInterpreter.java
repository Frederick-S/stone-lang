package book.chap9;

import stone.ClassParser;
import stone.ParseException;
import book.chap6.BasicInterpreter;
import book.chap7.NestedEnv;
import book.chap8.Natives;

public class ClassInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClassParser(), new Natives().environment(new NestedEnv())); 
    }
}
