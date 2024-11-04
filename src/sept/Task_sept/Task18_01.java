package sept.Task_sept;

public class Task18_01 {
    public static void main(String[] args) {
        /**Give some another example of Widening with Implicit and Explicit,
         *  Narrowing with implicit and explicit.
         **/
        //Widening with implicit conversion
        int a=50;
        long b=(long)a;
        float c=(float)b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Narrowing with implicit and explicit.
        //double->float->long->int->short->byte
        double d = 100;
        long l = (long)d;
        int i = (int)l;
        System.out.println(d);
        // some  part lost
        System.out.println(l);
        // some part lost
        System.out.println(i);


    }
}
