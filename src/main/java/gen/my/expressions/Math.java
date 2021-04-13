package gen.my.expressions;

public class Math extends Expression {

    private String operation;
    private  Expression left, right;

    public Math(String operation, Expression left, Expression right) {
        this.operation = operation;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        switch (operation) {
            case "plus": {
                return left.toString() + "+" + right.toString();
            }
            case "minus": {
                return left.toString() + "-" + right.toString();
            }
            case "mult": {
                return left.toString() + "*" + right.toString();
            }
            case "div": {
                return left.toString() + "/" + right.toString();
            }
        }
        return "nothing";
    }
}
