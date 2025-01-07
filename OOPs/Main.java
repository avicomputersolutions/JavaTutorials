package OOPs;

public class Main {
    public static void main(String[] args) {
     Employee karan = new Employee(121,120000,"Karan","Web"); 
    
    
     // karan.empid= 121;
    // karan.department="Web";
    // karan.name="Karan";
    // karan.salary=120000;

    
    Employee Soman = new Employee();
    Soman.name="Soman";
    Soman.empid=122;
    Soman.salary=100000;
    Soman.department="HR";
    
    Manager om = new Manager();
    om.emps.add(karan);
    om.emps.add(Soman);

    Manager keshwal = new Manager();
    
    karan.mname = om;
    
    Soman.mname= keshwal;

    
    System.out.println(om.emps);
    System.out.println(karan.name);
    System.out.println(om.emps.get(0).salary);
    
    }
}
