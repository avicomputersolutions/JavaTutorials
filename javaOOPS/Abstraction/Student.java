public class Student {
    String name;
    protected int roll;
    private long Mno;
    int attendance;
    int marks;
    

   private Student(){

    }

    Student(String n,int roll){
        name = n;
        this.roll =roll;
    }
    Student(String n, int roll, long mno){
        this.name = n;
        this.roll = roll;
        this.Mno = mno;

    }
    Student(String n, int roll, long mno,int att, int mrk){
        this.name = n;
        this.roll = roll;
        this.Mno = mno;
        this.attendance =att;
        this.marks = mrk;
    }

    protected void setAttendance(){
        this.attendance +=1;
    }

    protected void setAttendance(int att){
        this.attendance += att;
    }
}
