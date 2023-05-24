


package Oops;

class Pen{
    String color;
    String type ; //ball point ; gel

    public  void write(){
        System.out.println("Writing Something....");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
class Student{
     String name;
     int age;

     public void printInfo(){
         System.out.println(this.name);
         System.out.println(this.age);
     }
     //non parameterized constructor
//     Student(){
//         System.out.println("constructor Called");
//     }
    //parameterized constructor
//    Student(String name , int age){
//         this.name = name;
//         this.age = age;
//    }

    //copyConstructor

    Student(Student s2){
         this.name = s2.name;
         this.age = s2.age;
    }
    Student(){
         
    }

}
//Function overloading
class Student2{
    String name;
    int age;

    public void printInfo1(String name){
        System.out.println(name);
    }
    public void printInfo1(int age){
        System.out.println(age);
    }
    public void printInfo1(String name , int age){
        System.out.println(name + " " + age);
    }
}

//inheritance
class  Shape{
    public void area(){
        System.out.println("Display area");

    }

}

//Single level inheritance
class Triangle extends Shape{
      public void  area(int length ,int height){
          System.out.println(1/2*length*height);
      }

}
//multilevel inheritance
class EquilateralTriangle extends Triangle{
    public void  area(int length, int height){
        System.out.println(1/2*length*height);
    }

}
//Hierarchical inheritance
class  Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }

}



public class oops {
    public static void main(String[] args) {

      // Student student1 = new Student("Manish Kumar",22);
//       student1.name = "Manish Kumar";
//       student1.age = 22;
//        Student s1 = new Student();
//        s1.name = "ravi";
//        s1.age = 19;
//
//        Student s2 = new Student(s1);
//            s2.printInfo();

//        Student2 s1 = new Student2();
//        s1.name ="Manish Kumar";
//        s1.age = 20;
//        s1.printInfo1(s1.name);
//        s1.printInfo1(s1.age);
//        s1.printInfo1(s1.name, s1.age);
//
//        Triangle t1 = new Triangle();
//        t1.color = "Green";











    }

}
