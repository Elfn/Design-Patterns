public class Shirt implements Visitable{
  private double price;

  public Shirt(double price) {
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
