abstract class Main {
    public int age = 23;
    public String name = "Bini";
    public abstract void aim ();
}

class People extends Main {
    public int study = 12;
    public void aim(){
        System.out.println("Hello an how are you?");
    }
}