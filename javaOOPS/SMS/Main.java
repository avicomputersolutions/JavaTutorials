package javaOOPS.SMS;

public class Main {
    public static void main(String[] args) {
        School s= new School();
        s.schoolid =117;
        s.schoolname ="Sage university";

        
        Student sonam =new Student();
        sonam.id = 22222222;
        sonam.name ="Pagalkhane ki Queen";
        sonam.email ="sonam@gmail.com";
        sonam.Mno =9998979695l;
        sonam.address ="Agra";
        sonam.pass ="9211";
        
        Registration  r1= new Registration();
        r1.reg_id = 20101010;
        r1.type ="Contract";
        r1.desc ="Dkhjfgdfhjkl";


        sonam.reg_id =r1;

        Course Btech = new Course();
        Btech.Course_name = "CSE";
        Btech.crs_desc =" Pglo ka Course";
        Btech.crs_type ="aao ya mat aao";
        Btech.id = 03;
        Btech.crs_std_id.add(sonam);
        Btech.schoolname ="Sage";


        System.out.println(Btech.Course_name);
        System.out.println(Btech.crs_std_id.get(0).name);
        System.out.println(Btech.crs_std_id.get(0).reg_id.type);
        System.out.println(Btech.schoolname);
    }
}
