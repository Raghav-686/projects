package P3;

class Parent
{
   int num1=90_000;
}

class Child extends Parent
{
    int num1=80_000;
    public void m1()
    {
        System.out.println(num1);
        System.out.println(super.num1);  //super can only access the imediate class
    }

    /*@Override
    public String toString() {
        return a + " ";
    }*/

    /*Child()
    {
        a=68;
        System.out.println("child constructor");
        System.out.println(this.hashCode());
    }*/
}

public class Test46 {
    public static void main(String[] args) {
        Child obj1=new Child();
        //System.out.println(obj1);
       // System.out.println(obj1.toString());
       // String s="Raghav";
        //System.out.println(s);
        obj1.m1();
    }
}
