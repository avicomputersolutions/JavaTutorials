package javaOOPS;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.id = 121;
        t1.name = "Avi";
        
        // Student1
        Student s1=new Student();
        s1.name ="Hariom";
        s1.roll =3;
        s1.Mno =9876543210l;

        Address a1 =new Address();
        a1.city="Indore";
        a1.country="india";

        s1.address =a1;
        s1.attendance =0;
        s1.marks =0;

        Student s2=new Student();
        s2.roll =2;
        s2.name ="krishan";
        s2.Mno =9876743210l;
        s2.address =a1;
        s2.attendance =0;
        s2.marks =0;

        Student s3=new Student();
        s3.roll =1;
        s3.name ="Raj";
        s3.Mno =9876733210l;
        s3.address =a1;
        s3.attendance =0;
        s3.marks =0;

        t1.studentlist.add(s1);
        t1.studentlist.add(s2);
        t1.studentlist.add(s3);


        System.out.println(t1.id);
        System.out.println(t1.name);
        System.out.println(t1.studentlist.get(0).name);
        System.out.println(t1.studentlist.get(0).address.city);
    }
}
