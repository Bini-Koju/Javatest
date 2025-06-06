abstract class JavaModifiers {
 int math = 567;
 abstract void study ();
}

class Child extends JavaModifiers{
    String science = "Good to study";
    public void study (){
        System.out.println("Great going");
    }
}


class Main2{
    public static void main( String[] args){
        Child myObj = new Child();
        System.out.println(myObj.science);
        System.out.println(myObj.math);
        myObj.study();
    }
}

//This is only for abstract modifier