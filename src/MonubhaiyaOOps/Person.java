package MonubhaiyaOOps;

public class Person {
   private String name;
   private int age;

    //non parameterised constructor
//    public Person(){
//        this.name= "Motu";
//        this.age = 24;
//    }
    //parameterised constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }


    public void fun(){
        int Adhar_no = 48950393;
        System.out.println(this.name+" "+this.age+" "+ Adhar_no);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}
