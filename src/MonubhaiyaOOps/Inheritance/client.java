package MonubhaiyaOOps.Inheritance;

public class client {
    public static void main(String[] args) {
        //Case 1
//        p obj = new p();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

         //*important
        //case 2
//        p obj = new c();
//        System.out.println(obj.d); //1
//        System.out.println(obj.d1); //10
//        System.out.println(((c)(obj)).d2); //20
//        System.out.println(((c)(obj)).d); //2
//        obj.fun();
//        obj.fun1();
//        ((c)(obj)).fun2();

        //Case 3 not allowed in any language
//        c obj =  new p();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);//p
//        System.out.println(obj.d2);//c
//        obj.fun();

        //Case 4
        c obj = new c();
        System.out.println(obj.d); //c
        System.out.println(obj.d1); //p
        System.out.println(obj.d2);  //c
        System.out.println(((p)obj).d);//p
        obj.fun();
        obj.fun1();
        obj.fun2();

    }
}
