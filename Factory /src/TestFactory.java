import interfaces.HamburgerStore;
import models.CheeseBurger;
import models.Hamburger;
import models.JamHamburgerstore;
import models.MozHamburgerStore;

/**
 * Created by Elimane on Jul, 2020, at 17:37
 */
public class TestFactory {
    public static void main(String[] args) {

        CheeseBurger cheeseBurger = new CheeseBurger();

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerstore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n" );


        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");


    }
}
