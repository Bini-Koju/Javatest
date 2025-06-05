public class JavaMethodScope {
    static void myMethod(){
        int x = 507;
        System.out.println(x);
    }
    static int recursion (int x) {
        if (x > 0) {
            return x + recursion(x - 1);
        } else {
            return 0;
        }
    }
    public static void main (String[] args){
        int xa= 80;
        {
            int x = 50;
            System.out.println(x);
            myMethod();
            System.out.println(recursion (20));
        }
        System.out.println(xa);
    }
}
