 class JavaInheritance {
     protected String greet= "Hello and HOa are you?" ;
public void detail(){
    System.out.println("HEllo hello hello");
}

}
class JavaIn extends JavaInheritance{
    private int age = 45;
    public static void main (String[] args)
    {
        JavaIn myObj = new JavaIn();
        System.out.println( myObj.greet);
        System.out.println( myObj.age);
        myObj.detail();
    }
}
