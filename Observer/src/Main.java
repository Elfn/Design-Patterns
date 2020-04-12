import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSubscriber;

/**
 * Created by Elimane on Apr, 2020, at 22:50
 */
public class Main {
    public static void main(String[] args)
    {

        EmailTopic topic = new EmailTopic();

        //Create Observer
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

        //Register Observers
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        //Attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //Check for updates
//        firstObserver.update();
//        secondObserver.update();

        //Subject (Provider/Broadcaster)
        topic.postMessage("Hello subscribers!");
    }
}
