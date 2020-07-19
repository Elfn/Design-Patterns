package models;


import interfaces.HamburgerStore;

public class JamHamburgerstore extends HamburgerStore {
    public JamHamburgerstore() {
    }

    @Override
    public Hamburger createHamburger(String type) {

        if (type.equals("cheese")) {
            return new JamaicanCheeseBurger();
        }else if (type.equals("veggie")) {
            return new JamaicanVeggieBurger();

        }else  return null;
    }
}
