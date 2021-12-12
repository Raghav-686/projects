package P4;

public abstract class Compartment {
    public abstract String notice();
}
 class FirstClass extends Compartment
{
    @Override
    public String notice() {
        String s="FirstClass Compartment";
        return s;
    }
}
class Ladies extends Compartment
{
    @Override
    public String notice() {
        String s="Ladies compartment";
        return s;
    }
}
class General extends Compartment
{
    @Override
    public String notice() {
        String s="General compartment";
        return s;
    }
}
class Luggage extends Compartment
{
    @Override
    public String notice() {
        String s="Luggage Compartment";
        return s;
    }
}

class TestCompartment
{
    public static void main(String[] args) {
        Compartment arr[]=new Compartment[10];

        for(int i=0;i<10;i++)
        {
            double a=Math.random()*4;
            int j=(int)a;
          if(j==0)
          {
              arr[i]=new FirstClass();
              System.out.println(arr[i].notice());

          }
            if(j==1)
            {
                arr[i]=new Ladies();
                System.out.println(arr[i].notice());

            }
            if(j==2)
            {
                arr[i]=new General();
                System.out.println(arr[i].notice());

            }
            if(j==3)
            {
                arr[i]=new Luggage();
                System.out.println(arr[i].notice());

            }
        }
    }
}
