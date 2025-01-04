package OOPs;

import java.util.ArrayList;

public class Manager {
    int mid;
    String Name;
    int salary;
    String department;
    ArrayList<Employee> emps=new ArrayList<>();

    Manager(){}

    Manager(int mid, String name, int salary, String department, ArrayList<Employee> emps) {
        this.mid = mid;
        this.Name = name;
        this.salary = salary;
        this.department = department;
        this.emps = emps;
    }
    
}
