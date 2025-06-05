public class JavaClassOOP {

 int x = 5;
String name = "Bini";

public void myMethod (){
int a = 6778676;
System.out.println(a);
}
static void myMethodStatic (){
        String a = "Since it is static, we don't use object";
        System.out.println(a);
    }
    public static void main(String[] args) {
        JavaClassOOP myObj = new JavaClassOOP();
        myObj.myMethod();
        myMethodStatic();
        JavaClassOOP myObj1 = new JavaClassOOP();  // Object 1
        JavaClassOOP myObj2 = new JavaClassOOP();  // Object 2
        JavaClassOOP myObj3= new JavaClassOOP();
        myObj3.x = 45;
        System.out.println(myObj1.x + "  "+myObj1.name);
        myObj3.name= "KOju";
        System.out.println(myObj2.x);

        System.out.println(myObj3.x + " " + myObj3.name);
    }

}
