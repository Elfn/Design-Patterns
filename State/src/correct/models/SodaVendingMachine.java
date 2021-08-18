package correct.models;

/**
 * @createdBy elimane.fofana on mer. at 12:59
 */
public class SodaVendingMachine {
    private String msg = "";
    State soldOutState;
    State noMoneyState;
    State hasMoneyState;
    State soldState;

    State state = soldOutState;
    int count = 0;

    public SodaVendingMachine(int numberOfSodas) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);

        this.count = numberOfSodas;

        if(numberOfSodas > 0) {
            state = noMoneyState;//If there are more than 0 sodas we set the state to the NoMoneyState
        }

    }

    //Actions
    public void insertMoney(){
        state.insertMoney();
    }
    public void ejectMoney(){
        state.ejectMoney();
    }
    public void selectSoda(){
        state.select();
    }
    public void dispense(){
        state.dispense();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
       StringBuffer res = new StringBuffer();
       res.append("\nThe SodaMachine, Co");
       res.append("\nInventory: "+count+" soda");

       if(count > 1){
           res.append("s");
       }
       res.append("\n");
       res.append("Soda Vending Machine is "+state+"\n");

       return res.toString();
    }
}
