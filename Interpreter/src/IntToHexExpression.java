/**
 * @createdBy elimane.fofana on ven. at 16:54
 */
public class IntToHexExpression implements Expression{

    int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interPret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexaDecimalFormat(i);
    }
}
