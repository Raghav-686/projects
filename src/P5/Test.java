package P5;
//overriding of methods
//covarient type
/*class First
{
    public First m1()
    {
        System.out.println("inside first m2");
        //return this;
        return new First();
    }
}
class Second extends First
{
    public Second m1()
    {
        System.out.println("inside second m1");
        return new Second();
    }
}

public class Test {
    public static void main(String...args) {
         First obj=new First();
         Second obj1=new Second();
         obj.m1();
         obj1.m1();
    }
}*/
//runtime polymorphism
class First
{
    public void m1()
    {
        System.out.println("inside first m2");
    }
}
class Second extends First
{
    public void m1()
    {
        System.out.println("inside second m1");
    }
}

public class Test {
    public static void main(String...args) {
         First obj=new First();
         Second obj1=new Second();
         obj.m1();
         obj1.m1();
         First obj3=new Second();
         obj3.m1();
    }
}

