import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//The intermediary ATM(Automated Teller Machines/Distributeur automatique/Guichet automatique) between Real bank and client(Bank interface)
//It will filter access
public class ProxyBank implements Bank{
  private RealBank bank = new RealBank();
  private static List<String> bannedClients;

  static {
    bannedClients = new ArrayList<>();
    bannedClients.add("John");
    bannedClients.add("Eric");
    bannedClients.add("Mark");
  }

  @Override
  public void withdrawMoney(String clientName) throws Exception {
     if(bannedClients.contains(clientName.toLowerCase())){
       throw new Exception("Access denied you are not who you say you are!!!");
     }

     bank.withdrawMoney(clientName);
  }
}
