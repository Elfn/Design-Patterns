public class Originator {
    //This string is just to simplify understanding
    //In real application you would have an actual
    //Java model class: Person.Java, Character.Java etc...
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        state = memento.getState();
    }
}
