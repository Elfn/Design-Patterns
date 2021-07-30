import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List mementos = new ArrayList();

    public void addMemento(Memento me)
    {
        mementos.add(me);
    }

    public Memento getMemento(int index){
        return (Memento) mementos.get(index);
    }

}
