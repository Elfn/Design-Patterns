public class DirectorPurchasePower extends PurchasePower{
    @Override
    protected double getAllowable() {
        return BASE * 100;
    }

    @Override
    protected String getRole() {
        return "DIRECTOR";
    }
}
