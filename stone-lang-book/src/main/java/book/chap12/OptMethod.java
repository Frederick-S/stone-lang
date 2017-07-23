package book.chap12;

import stone.ast.BlockStmnt;
import stone.ast.ParameterList;
import book.chap11.ArrayEnv;
import book.chap11.OptFunction;
import book.chap6.Environment;

public class OptMethod extends OptFunction {
    OptStoneObject self;
    public OptMethod(ParameterList parameters, BlockStmnt body,
                     Environment env, int memorySize, OptStoneObject self)
    {
        super(parameters, body, env, memorySize);
        this.self = self;
    }
    @Override public Environment makeEnv() {
        ArrayEnv e = new ArrayEnv(size, env);
        e.put(0, 0, self);
        return e;
    }
}
