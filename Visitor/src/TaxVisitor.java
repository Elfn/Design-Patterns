import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public TaxVisitor() {
    }

    @Override
    public int visit(Shirt shirt) {
        System.out.println("Shirt final price with tax:");
        return (int) ((shirt.getPrice() * .18) + shirt.getPrice());
    }

    @Override
    public int visit(TShirt tShirt) {
        System.out.println("Shirt final price with tax:");
        return (int)((tShirt.getPrice() * .20) + tShirt.getPrice());
    }

    @Override
    public int visit(Jacket jacket) {
      System.out.println("Jacket final price with tax:");
      return (int) ((jacket.getPrice() * .22) + jacket.getPrice());

    }
}
