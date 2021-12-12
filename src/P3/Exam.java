package P3;

public class Exam {
    public int rollno;
    public String course;
    public int marks;
    public Exam()  //non parametrized constructor
    {
        rollno=0;
        course="Unkown";
        marks=0;
    }
    /*public Exam(int rollno,String course,int marks)
    {
        this.rollno=rollno;
        this.course=course;
        this.marks=marks;
    }
    public Exam(int rollno,int marks)
    {
        this.marks=marks;
        this.rollno=rollno;
        this.course="MCA";
    }*/
    public void setvalue(int rollno,String course,int marks)
    {
        this.rollno=rollno;
        this.marks=marks;
        this.course=course;
    }
    public void setvalue(int rollno,int marks)
    {
        this.rollno=rollno;
        this.marks=marks;
    }
    public void display()
    {
        System.out.println(rollno+" "+course+" "+marks);
    }
}
