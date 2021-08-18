package correct.models;


/**
 * @createdBy elimane.fofana on mer. at 12:52
 */
public class SoldState implements State {

    SodaVendingMachine sodaVendingMachine;

    public SoldState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Give a second... soda coming right up ");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Sorry... soda is coming...");
    }

    @Override
    public void select() {
        System.out.println("Nope... you can't eject money if you already have the soda");
    }

    @Override
    public void dispense() {
        System.out.println("Stop trying trying to get second soda for free");
        if(sodaVendingMachine.getCount() > 0){
            sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
        }else{
            System.out.println("Sorry... out of sodas");
            sodaVendingMachine.setState(sodaVendingMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "Dispensing soda...";
    }
}
