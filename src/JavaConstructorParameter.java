public class JavaConstructorParameter{
int age;
String model;
    public JavaConstructorParameter(int height, String name){
       age = height;
       model = name;
    }

    public static void main(String[] args){
        JavaConstructorParameter myObj = new JavaConstructorParameter(45, "Karishma");
        System.out.println (myObj.age  +  " " + myObj.model);
    }
}