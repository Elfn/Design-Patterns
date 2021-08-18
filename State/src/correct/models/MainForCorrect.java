package correct.models;

import correct.models.SodaVendingMachine;
import obvious.SodaMachine;

/**
 * @createdBy elimane.fofana on mer. at 11:50
 */
/*
* Allows an object to alter its behavior when its internal state changes.
* The object will appear to change its class
* */
public class MainForCorrect {
    public static void main(String[] args) {
        SodaVendingMachine sodaVendingMachine = new SodaVendingMachine(10);

        System.out.println(sodaVendingMachine);

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();

        
        System.out.println(sodaVendingMachine);

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();

        System.out.println(sodaVendingMachine);

    }
}
