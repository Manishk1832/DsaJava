package MonubhaiyaOOps.Inheritance;

import MonubhaiyaOOps.NewStudent;

public class Student_Client_ {
    public static void main(String[] args) {
        NewStudent s = new NewStudent("Ram Lal",78);
      // Object b = new Object();
        System.out.println(s);
       // ArrayList<>
        NewStudent s1 = new NewStudent("Manish" ,25);
        System.out.println(s1);
        System.out.println(NewStudent.count);
        NewStudent.Hello();
    }
}
