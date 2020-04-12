import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSubscriber;

/**
 * Created by Elimane on Apr, 2020, at 22:50
 */

/**
* @Observer_Design
 * Define one to many relationship between objects so that
 * when an object's state change all its dependent objects
 * are notified
 *
 * @PROS
 * It supports the principle of loose coupling between objects that interact with each other.
 * It allows sending data to other objects effectively without any change in the Subject or Observer classes.
 *
 * @CONS
 * The Observer interface has to be implemented by ConcreteObserver , which involves inheritance. ...
 * If not correctly implemented, the Observer can add complexity and lead to inadvertent performance issues.
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

        //Check for updates => will display " No new message on this topic"
        //for that two observers as we don't post a message yet
//        firstObserver.update();
//        secondObserver.update();

        //Subject (Provider/Broadcaster)
        topic.postMessage("Hello subscribers!");
        topic.postMessage("Hello  2!");
        //Will display :
//            FirstObserver Retrieving message: Hello subscribers!
//            SecondObserver Retrieving message: Hello subscribers!
//            ThirdObserver Retrieving message: Hello subscribers!
    }
}
