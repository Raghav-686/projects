package p1;

public class Stu {
    protected int rollno;   //instance variable
    private String str;
    public Stu()
    {
      rollno=10;
      str="GLA";
    }

    public Stu(int rollno, String str) {
        this.rollno = rollno;
        this.str = str;
    }

    public int getRollno() {
        return rollno;
    }

    public String getStr() {
        return str;
    }

    public void display()
    {
        System.out.println(rollno+" "+str);
    }
}
