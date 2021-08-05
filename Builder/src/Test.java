public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Person p1 = new Person.Builder("Eric","Stan").phone("+12547893254").age(25).address("London 241");
        sb.append("Hello Mr, ").append("welcome");
        System.out.println(sb);
        System.out.println(p1.toString());
    }
}
