package interfaces;

/**
 * Created by Elimane on Apr, 2020, at 22:52
 */
public interface Subject {
    public void register(Observer observer);
    public void unRegister(Observer observer);
    public void notifyObservers();
    public Object getUpdate(Observer observer);
}
