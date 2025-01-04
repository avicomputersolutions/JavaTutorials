package OOPs;

public class Employee {
    
    // Properties of Object
    int empid;
    int salary;
    String name;
    String department;

    // Methods
    // Non - parameterized Contructor
    Employee(){}
    // parameterized Contructor
    Employee(int empid,int salary, String name,String department){
        this.empid = empid;
        this.salary= salary;
        this.name= name;
        this.department=department;
    }

}
