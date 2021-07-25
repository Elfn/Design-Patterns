public class TShirt implements Visitable{
  private double price;

  public TShirt(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public int accept(Visitor visitor) {
    return visitor.visit(this);
  }
}
