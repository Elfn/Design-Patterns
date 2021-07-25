
/*
*
* @VISITOR: Allows us to add methods to classes of different types
* without much altering to those classes
* */
public class Test {
    public static void main(String[] args) {

      //Tax calculation declaration
      TaxVisitor tax = new TaxVisitor();

      //Items
      Jacket jacket = new Jacket(40.99);
      TShirt tShirt = new TShirt(5.99);
      Shirt shirt = new Shirt(7.99);

      //Use tax calculation on items
      System.out.println(jacket.accept(tax));
      System.out.println(tShirt.accept(tax));
      System.out.println(shirt.accept(tax));



    }
}
