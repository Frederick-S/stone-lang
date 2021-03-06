package book.chap13;

import stone.FuncParser;
import stone.ParseException;
import book.chap11.EnvOptInterpreter;
import book.chap8.Natives;

public class VmInterpreter extends EnvOptInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new FuncParser(),
            new Natives().environment(new StoneVMEnv(100000, 100000, 1000)));
    }
}
