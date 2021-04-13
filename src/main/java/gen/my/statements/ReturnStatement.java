package gen.my.statements;

import gen.my.base.Base;
import gen.my.expressions.Expression;

public class ReturnStatement extends Statement {
    private Expression statement;

    public ReturnStatement(Expression statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return  "return " + this.statement.toString();
    }
}
