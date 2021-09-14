package cloneable;

/**
 * @createdBy elimane.fofana on lun. at 16:43
 */
public class Person implements Human {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person is created!");
    }

    @Override
    public String toString() {
        return "simple.Person{" +
                "name='" + name + '\'' +
                ", Id='" + System.identityHashCode(this) + '\'' +
                '}';
    }

    @Override
    public Human clone() {

        System.out.println("Creating a person clones...");
        Person person = null;
        try {
            person = (Person) super.clone();
            person.name = "John";
            person.age = 25;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return person;
    }
}
