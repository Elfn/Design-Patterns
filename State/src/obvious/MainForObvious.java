package obvious;

import obvious.SodaMachine;

/**
 * @createdBy elimane.fofana on mer. at 11:50
 */
/*
* Allows an object to alter its behavior when its internal state changes.
* The object will appear to change its class
* */
public class MainForObvious {
    public static void main(String[] args) {
        SodaMachine sodaMachine = new SodaMachine(10);
        sodaMachine.insertMoney();
        sodaMachine.selectSoda();

        System.out.println("Inventory: "+ sodaMachine.count);

        System.out.println("*******************************");

        sodaMachine.insertMoney();
        sodaMachine.ejectMoney();
        sodaMachine.selectSoda();

        System.out.println("Inventory: "+ sodaMachine.count);

        System.out.println("*******************************");

        sodaMachine.insertMoney();
        sodaMachine.selectSoda();
        sodaMachine.insertMoney();
        sodaMachine.selectSoda();
        sodaMachine.ejectMoney();

        System.out.println("Inventory: "+ sodaMachine.count);

        System.out.println("*******************************");
    }
}
