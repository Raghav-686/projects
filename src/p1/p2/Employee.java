package p1.p2;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Employee {
    public int id;
    public String name;
    public int sal;
    public static int count;
    {
        count++;
    }

    public Employee()
    {
        Scanner s=new Scanner(System.in);
        id=1;
        name="raghav";
        sal=20000
        ;
    }

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }



    public void display()
    {
        System.out.println(id +" "+ name+" "+sal);
    }
}
