package book.chap8;

import javassist.gluonj.util.Loader;
import book.chap7.ClosureEvaluator;

public class NativeRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(NativeInterpreter.class, args, NativeEvaluator.class,
                   ClosureEvaluator.class);
    }
}
