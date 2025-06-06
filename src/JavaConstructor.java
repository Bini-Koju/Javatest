public class JavaConstructor {
    int x;

    public JavaConstructor (){
        x = 34;
    }
    public int changeX(){
       x= 374;
       return x ;
    }
    public static void main (String[] args)
    {
        JavaConstructor myObj =  new JavaConstructor();
        System.out.println(myObj.x);
      myObj.changeX();
        System.out.println(myObj.x);
    }
}
