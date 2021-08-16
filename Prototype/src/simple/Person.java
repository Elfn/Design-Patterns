package simple;

/**
 * @createdBy elimane.fofana on lun. at 16:25
 */
public class Person implements Prototype{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "simple.Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Prototype clone() {
        return new Person(name,age);
    }
}
