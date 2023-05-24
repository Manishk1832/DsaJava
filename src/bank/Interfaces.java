package bank;
interface Animal{
    void walk();
}
interface Herbivore{

}
class Horse implements Animal,Herbivore {

    public void  walk(){
        System.out.println("Walks on 4 legs");
    }

}

class Student{
    String name;
    static String school;
    public  static void  changeSchool(){
        school = "new School";
    }

}


public class Interfaces {
    public static void main(String[] args) {
          Student.school="ABC";
          Student student1 = new Student();
          student1.name = "Manish";
        System.out.println(student1.school);
    }
}
