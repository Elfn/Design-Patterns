public class CEOPurchasePower extends PurchasePower{
    @Override
    protected double getAllowable() {
        return BASE * 1000;
    }

    @Override
    protected String getRole() {
        return "CEO";
    }
}
