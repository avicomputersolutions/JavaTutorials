package OOPs;

public class Employee {
    
    // Properties of Object
    int empid;
    int salary;
    String name;
    String department;
    Manager mname;

    // Methods

    // Creating // Initialize // define
    // Non - parameterized Contructor
    // Blank Oject
    
    Employee(){}
   
   
    // parameterized Contructor
    // Oject with Value
    Employee(int empid,int salary, String name,String department){
        this.empid = empid;
        this.salary= salary;
        this.name= name;
        this.department=department;
    }

}
