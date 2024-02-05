import java.util.*;
class First{
    First()
    {
        System.out.println("Hello Students...");
    }
    void msg()
    {
        System.out.println("Good Morning...");
    }
}
class Cons1{
    public static void main(String[] args)
    {
        First f=new First();
        f.msg();
    }
}