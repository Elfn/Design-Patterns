package simple;

/**
 * @createdBy elimane.fofana on lun. at 16:28
 */
public class Animal implements Prototype{
    private String name;
    private int age;

    public Animal(String name, int age) {
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
        return new Animal(name,age);
    }
}
