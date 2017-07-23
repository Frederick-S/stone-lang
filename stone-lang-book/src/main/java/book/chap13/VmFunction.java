package book.chap13;

import stone.ast.BlockStmnt;
import stone.ast.ParameterList;
import book.chap6.Environment;
import book.chap7.Function;

public class VmFunction extends Function {
    protected int entry;
    public VmFunction(ParameterList parameters, BlockStmnt body,
                      Environment env, int entry)
    {
        super(parameters, body, env);
        this.entry = entry;
    }
    public int entry() { return entry; }
}
