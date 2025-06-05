public class JavaMethodOverloading{
    static int myMethod (int x){
        return x+ 5;
    }
    static int myMethod (int x, int y){
        return x+ 5 +3 +y;
    }
    static double myMethod(double y ){
        return y+ y;
    }

    public static void main (String[] args){
        int z = myMethod(5);
        int g = myMethod(5, 4);
        double a = myMethod(4.4);
        System.out.println(z);
        System.out.println(a);
        System.out.println(g);
    }
}