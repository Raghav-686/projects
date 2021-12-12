package P5;
/*
interface
 */
/*
class First
{
    //instance variables and methods
}
interface i1
{
    public abstract methods
    default public void method-name()
    {
    //default behaviour
    }
    private voi method_name()
    {
    //with behaviour
    }
    public static void method_name()
    {}
    public static final
}
*/
/*interface i1
{
    public void m1();
    public void m2();
    private void m5()
    {
        System.out.println("h1");
        System.out.println("h2");
        System.out.println("h3");
        System.out.println("h4");
    }
    default public void m3(){
        m5();
        System.out.println("h5");
        System.out.println("h6");
    }
    default public void m4(){
        m5();    //nesting of methods
        System.out.println("h7");
        System.out.println("h8");
    }
}
class first implements i1
{

    @Override
    public void m1() {
        System.out.println("First m1");
    }

    @Override
    public void m2() {
        System.out.println("First m2");
    }

    @Override
    public void m3() {
        System.out.println("First m3");
    }
}
class Second1 implements i1
{

    @Override
    public void m1() {
        System.out.println("Second1 m1");
    }

    @Override
    public void m2() {
        System.out.println("Second1 m2");
    }
}
public class Test1 {
    public static void main(String...args) {

    }
}*/
class Four
{
    static int a;
    public static void m1()
    {
        a=89;
        System.out.println(a);
    }

    public static void main(String[] args) {
        m1();
    }
}
interface i6
{
    public static final int a=90;
    public static void m1()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        m1();
    }
}
