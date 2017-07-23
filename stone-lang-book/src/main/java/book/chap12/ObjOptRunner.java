package book.chap12;

import javassist.gluonj.util.Loader;
import book.chap8.NativeEvaluator;

public class ObjOptRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(ObjOptInterpreter.class, args, ObjOptimizer.class,
                                                  NativeEvaluator.class);
    }
}
