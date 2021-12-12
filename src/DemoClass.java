import p1.Stu;
import p1.p2.Employee;

import java.util.Scanner;

public class DemoClass extends Stu {
    public static void main(String[] args) {
        //Stu obj=new Stu();
        //System.out.println(obj.getRollno());
        //System.out.println(obj.getStr());
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        Employee obj3 = new Employee();
        int res=(obj1.sal+obj2.sal+obj3.sal)/Employee.count;
        System.out.println(res);
        System.out.println(Employee.count);
        //DemoClass obj=new DemoClass();
        //----------------System.out.println(obj.rollno);
    }
}
