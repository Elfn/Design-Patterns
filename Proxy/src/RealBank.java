public class RealBank implements Bank{



  @Override
  public void withdrawMoney(String clientName) throws Exception {
    System.out.println(clientName+" Withdrawing from the ATM....");
  }
}
