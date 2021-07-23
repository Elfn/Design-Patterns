import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public TaxVisitor() {
    }

    @Override
    public double visit(Shirt shirt) {
        System.out.println("Shirt final price with tax:");
        return Double.parseDouble(decimalFormat.format(shirt));
    }

    @Override
    public double visit(TShirt tShirt) {
        System.out.println("Shirt final price with tax:");
        return Double.parseDouble(decimalFormat.format(shirt));
    }

    @Override
    public double visit(Jacket jacket) {
        return 0;
    }
}
