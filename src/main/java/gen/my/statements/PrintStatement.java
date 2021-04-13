package gen.my.statements;

public class PrintStatement extends Statement {

    private String text;

    public PrintStatement(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "System.out.println(" + text + ")";
    }
}
