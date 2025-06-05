public class JavaMethod {
    static void method(String firstName, int age){
        System.out.println("This is the second file of java "  + firstName + " "+age);
    }

    static void voter (int age){
        if (age >= 18){
            System.out.println("The person is a voter");

        }
        else{
            System.out.println("The person is not a voter");
        }
    }
    static int add (int age){
        return 5 + age;
    }
    static String name(String lastname){
        return lastname + " abc";
    }
    public static void main (String[] args){
        method("Bini", 67);
        method("Bina", 57);
        voter(20);
        voter(2);
        voter (18);
        System.out.println(add (56));
        System.out.println(add(33));
        String full = name("Suwal");
        System.out.println(full);
        System.out.println(name("KOju"));
    }
}
