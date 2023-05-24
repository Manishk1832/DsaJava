package MonubhaiyaOOps;

public class StudnetNew_client {
    public static void main(String[] args)  {
        StudentNew s = new StudentNew("Rajma",23);
        s.setName("Kumar");
        s.setAge(-22);
        System.out.println(s.getAge()+" "+s.getName());

    }
}
