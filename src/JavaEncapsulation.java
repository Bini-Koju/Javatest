public class JavaEncapsulation {
private String name;
  public String getName(){
      return name;
  }
    public void setName(String newName) {
//        this.name = "KArina";
        this.name = newName;
    }

}
 class Main3{
    public static void main (String[] args)
    {
            JavaEncapsulation myObj = new JavaEncapsulation();
        myObj.setName ("John");
        System.out.println(myObj.getName());

    }
}
