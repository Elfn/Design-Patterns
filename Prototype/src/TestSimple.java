import simple.Animal;
import simple.Person;

/**
 * @createdBy elimane.fofana on lun. at 16:23
 */
/*
* Used when creating an instance of a given class is either expensive or complicated
* */
public class TestSimple {
    public static void main(String[] args) {

        Person person = new Person("Eric",22);
        Animal animal = new Animal("Dog",2);

        Animal animal1 = (Animal) animal.clone();
        Person person1 = (Person) person.clone();
        Person person2 = (Person) person.clone();

        System.out.println("simple.Person 1: "+person1.toString());
        System.out.println("simple.Person 2: "+person2.toString());
        System.out.println("simple.Animal 1: "+animal1.toString());

    }
}
