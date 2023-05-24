package MonubhaiyaOOps;

public class NewStudent {
    String name;
    int age;
    public static int count = 0;

    public NewStudent(){
       count++;
    }
    public NewStudent(String name, int age){
        this.age = age;
        this.name = name;
        count++;

    }
    @Override
    public String toString(){
        return this.name+" "+this.age;
    }
    public static void Hello(){
        System.out.println("Hey " );
    }
    static {
        System.out.println("In Static");
    }

}
