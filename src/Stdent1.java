import java.util.Scanner;

class Student1 {
    private int rollno;
    private String name;
    public int marks;
    public static String clgname = "GLA";
    Student1() {
        Scanner input = new Scanner(System.in);
        rollno = input.nextInt();
        name = input.next();
        marks = input.nextInt();
    }
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }
    public static void display(int n , int r , int m){
        System.out.println(n+" "+r+" "+m+" "+clgname);
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Enter no. of objects:");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        Student1 arr[] = new Student1[n];
        int c = 1000;
        int d = 0;
        for (int i = 0; i < n; i++) {
            arr[i] =new Student1();
            if(arr[i].marks<c){
                c=arr[i].marks;
                d=i;
            }
        }
        display(arr[d].rollno,arr[d].rollno,arr[d].marks);
    }
}
