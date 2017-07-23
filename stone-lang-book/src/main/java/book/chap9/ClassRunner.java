package book.chap9;

import javassist.gluonj.util.Loader;
import book.chap7.ClosureEvaluator;
import book.chap8.NativeEvaluator;

public class ClassRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(ClassInterpreter.class, args, ClassEvaluator.class,
                   NativeEvaluator.class, ClosureEvaluator.class);
    }
}
