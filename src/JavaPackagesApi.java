import java.util.Scanner;
public class JavaPackagesApi{
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name:");
        String username = myObj.nextLine();

        System.out.println("Enter your age:");
        int age = myObj.nextInt();

        System.out.println("Username is " + username);
        System.out.println("Age is " + age);
    }
}
