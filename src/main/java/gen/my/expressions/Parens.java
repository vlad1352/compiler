package gen.my.expressions;

public class Parens extends Expression{

    private Expression expression;

    public Parens(Expression  expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "(" + expression.toString() + ");";
    }


}
