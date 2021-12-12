package P3;
class A{}
class  B extends A{

}
class C extends B
{

}

public class Test23 {
    public static void m1(float f)                                          //public static void m1(B obj)
    {
        System.out.println("ok");
    }
    public static void m1(Integer f)                                       //public static void m1(A obj)
    {
        System.out.println("hell");
    }

    public static void m1(Double f)                                       //public static void m1(A obj)
    {
        System.out.println("Welcome");
    }
    public static void m1(double f)                                    //public static void m1(A obj)
    {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        m1(45);
    }
}

//Double d=12.67;
//Boxing
//Unboxing
