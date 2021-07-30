
/*
* The Memento Design Pattern offers a solution to implement undoable actions.
* We can do this by saving the state of an object at a given instant and restoring
* it if the actions performed since need to be undone.
* */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("Monster");

        Memento memento = originator.createMemento();

        CareTaker careTaker = new CareTaker();
        careTaker.addMemento(memento);

        originator.setState("Monster 2");
        originator.setState("Monster 3");

        memento = originator.createMemento();

        careTaker.addMemento(memento);

        originator.setState("Monster 4");

        System.out.println("Originator current state: "+originator.getState());

        System.out.println("Originator restoring to previous state....");
        memento = careTaker.getMemento(1);
        originator.restoreMemento(memento);

        System.out.println("Originator current state: "+originator.getState());
        System.out.println("Again restoring to previous state...");
        memento = careTaker.getMemento(0);
        originator.restoreMemento(memento);


        System.out.println("Originator current state: "+originator.getState());

    }
}
