package MonubhaiyaOOps;

public class Person_client {
    public static void main(String[] args) {
        Person p = new Person("Karan", 25);
        p.setName("Manish");
        p.setAge(-9);
        System.out.println(p.getAge());
        p.fun();

        Person p1 = new Person("Kumar",24);

        p1.fun();

    }
}
