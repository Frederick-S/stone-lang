package book.chap12;

import stone.ClassParser;
import stone.ParseException;
import book.chap11.EnvOptInterpreter;
import book.chap11.ResizableArrayEnv;
import book.chap8.Natives;

public class ObjOptInterpreter extends EnvOptInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClassParser(),
            new Natives().environment(new ResizableArrayEnv()));
    }
}
