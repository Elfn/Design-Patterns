import cloneable.Person;

/**
 * @createdBy elimane.fofana on lun. at 16:45
 */
/*
 * Used when creating an instance of a given class is either expensive or complicated
 * */
public class TestCloneable {
    public static void main(String[] args) {
        Person  person = new Person("John", 25);

        System.out.println("Person => "+ person.toString());

        Person p1 = (Person) person.clone();
        Person p2 = (Person) person.clone();
        Person p3 = (Person) person.clone();

        System.out.println("Person clone 1 => "+p1.toString());
        System.out.println("Person clone 2 => "+p2.toString());
        System.out.println("Person clone 3 => "+p3.toString());


//        System.out.println("Person 1 Id => "+System.identityHashCode(p1));
//        System.out.println("Person 2 Id => "+System.identityHashCode(p2));
//        System.out.println("Person 3 Id => "+System.identityHashCode(p3));
    }
}
