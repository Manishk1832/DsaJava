package MonubhaiyaOOps;

public class StudentNew {
    private  String name = "Monu";
    private int age = 78;
    public StudentNew(String name, int age){
        this.age = age;
        this.name = name;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
//    public void setAge(int age) throws Exception {
//        if(age<0){
//           throw new Exception("Age can't be negative");
//        }
//        this.age = age;
//    }
public void setAge(int age)  {
        try {


            if (age < 0) {
                throw new Exception("Age can't be negative");
            }
        }
        catch (Exception e){
//            System.out.println(e);
            e.printStackTrace();
        }
        finally {
            System.out.println("Hey this side Manish");
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}
