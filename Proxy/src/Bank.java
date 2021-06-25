//The means by which client will access banking service
public interface Bank {
  public void withdrawMoney(String clientName) throws Exception;
}
