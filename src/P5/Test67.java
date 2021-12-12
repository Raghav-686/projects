package P5;
interface i11
{
    default public void m1()
    {
        System.out.println("hello");
    }
}
interface i12
{
    default public void m1()
    {
        System.out.println("Welcome");
    }
}

public class Test67 implements i11,i12 {
        public void m1()
        {
            i11.super.m1();
            i12.super.m1();
        }
}
