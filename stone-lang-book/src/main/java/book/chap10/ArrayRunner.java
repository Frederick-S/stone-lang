package book.chap10;

import javassist.gluonj.util.Loader;
import book.chap7.ClosureEvaluator;
import book.chap8.NativeEvaluator;
import book.chap9.ClassEvaluator;
import book.chap9.ClassInterpreter;

public class ArrayRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(ClassInterpreter.class, args, ClassEvaluator.class,
                   ArrayEvaluator.class, NativeEvaluator.class,
                   ClosureEvaluator.class);
    }
}
