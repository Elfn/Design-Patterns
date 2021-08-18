package obvious;

/**
 * @createdBy elimane.fofana on mer. at 11:54
 */
public class SodaMachine {

    //STATES
    final static int SOLD_OUT = 0;
    final static int NO_MONEY = 1;
    final static int HAS_MONEY = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;
    String msg = "";

    public SodaMachine(int count) {
        this.count = count;
        state = (count > 0) ? NO_MONEY : HAS_MONEY;
    }

    //Actions
    public void insertMoney(){
        msg = (state == HAS_MONEY) ? "You can\'t insert another dollar bill" : (state == NO_MONEY) ? ("You inserted a dollar") : (state == SOLD_OUT) ? "The machine is sold out" : (state == SOLD) ? "Please wait we are already giving you a soda" : null;
        if(state == NO_MONEY) state = HAS_MONEY;
        System.out.println(msg);
    }
    public void ejectMoney(){
        msg = (state == HAS_MONEY) ? "Returning dollar bill" : (state == NO_MONEY) ? ("You havent\'t inserted a dollar bill") : (state == SOLD_OUT) ? "The machine is sold out" : (state == SOLD) ? "Already selected soda!" : null;
        if(state == HAS_MONEY) state = NO_MONEY;
        System.out.println(msg);
    }
    public void selectSoda(){
        msg = (state == SOLD) ? "Dispensing your soda has we speak...Enjoy!" : (state == NO_MONEY) ? ("You selected soda, but money first!") : (state == SOLD_OUT) ? "You are outta luck - No sodas left :(" : (state == HAS_MONEY) ? "You selected soda!" : null;
        if(state == HAS_MONEY) state = SOLD;dispense();
        System.out.println(msg);
    }
    public void dispense(){
        msg = (state == SOLD) ? "Dispensing your soda has we speak...Enjoy!" : (state == NO_MONEY) ? ("Please insert a dollar bill first!") : (state == SOLD_OUT) ? "Machine sold out" : (state == HAS_MONEY) ? "No soda dispensed!" : null;
        if(state == SOLD) {
            count--;
            if(count == 0){
                System.out.println("Sorry, out of sodas!");
                state = SOLD_OUT;
            }else state = NO_MONEY;
        }
        System.out.println(msg);
    }
}
