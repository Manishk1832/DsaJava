package MonubhaiyaOOps;

public class student_Client {
    public static void main(String[] args) {
        student sc =  new   student();
        System.out.println(sc.name);
        System.out.println(sc.age);

        sc.name= "Manish";
        sc.age = 22;
        System.out.println(sc.name);
        System.out.println(sc.age);


        student s1 = new student();
        s1.name = "Rohit";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);

       sc.Intro_YourSelf();
       s1.Intro_YourSelf();



    }
}
