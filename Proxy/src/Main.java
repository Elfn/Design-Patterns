import java.util.Locale;

/*
* @Pros
* The Composite pattern makes the client simple:
* -Clients use the Component class
*  interface to interact with objects in the composite structure.
* -If call is made to a Leaf, the request is handled directly.
* -If call is to a Composite, it forwards
*  the request to its child components
*
* @Cons
* -Once tree structure is defined, the composite design makes the tree overly general.
* -In specific cases, it is difficult to restrict the components of the tree to only particular types.
* -Therefore, to enforce such constraint, the program must rely on run-time checks, since it cannot
*  use the type system the of programming language.
* */
public class Main {
  public static void main(String[] args) {
    //
    Bank bank = new ProxyBank();

    try {
      bank.withdrawMoney("Mark".toLowerCase());
      bank.withdrawMoney("Eric".toLowerCase());

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
