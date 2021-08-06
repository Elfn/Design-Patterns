/**
 * @createdBy elimane.fofana on ven. at 16:54
 */
public class IntToBinaryExpression implements Expression{

    int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interPret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(i);
    }
}
