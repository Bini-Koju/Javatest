class JavaPolymorphism {
    public void detail(){
        System.out.println("This gives the detail of the specific topic");
    }
}

class Animal extends JavaPolymorphism{
    public void detail(){
        System.out.println("This is the detail of animal");
    }
}

class Book extends JavaPolymorphism{
    public void detail(){
        System.out.println("This is the detail of book");
    }
}

class Author extends JavaPolymorphism{
    public void detail(){
        System.out.println("This is the detail of Author");
    }
}


class Main4{
    public static void main(String[] args)
    {
        JavaPolymorphism myobj = new JavaPolymorphism();
        JavaPolymorphism myObj = new Author();
        JavaPolymorphism myObj2 = new Animal();
        JavaPolymorphism myObj3 = new Book();
        myobj.detail();
        myObj3.detail();
        myObj.detail();
        myObj2.detail();

    }
}