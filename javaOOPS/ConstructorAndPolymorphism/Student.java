package javaOOPS.ConstructorAndPolymorphism;

public class Student {
    String name;
    int roll;
    long Mno;
    int attendance;
    int marks;
    Address address;


    // Contructor - Class Method - use to assign the value from main to class variable
    // 1. Name should be same as Class
    // 2. Dont have any data type
    // 3. dont have return statement


    // Runtime Encapsulation
    // Constructor overloading
    // Non - paramterized - To maka a blank object - Default Constructor 
    Student(){

    }

    // paramterized Contructor
    Student(String n,int r,long m, int att, int mrk, Address add){
        name = n;
        roll = r;
        Mno = m;
        attendance= att;
        marks = mrk;
    }
    // Polymorphism - using same name for different operator
    // overloading - same class , same name, different paramterized
    // overloading - different class , same name, different paramterized
    // overridding - same name , different class, same paramterized


    // Getter Method

    String getName(){
        return name;
    }
    int getRoll(){
        return roll;
    }
    long getMno(){
        return Mno;
    }
    int getAttendance(){
        return attendance;
    }
    int getMark(){
        return marks;
    }

  void setRoll(int roll) {
        this.roll = roll;
    }


    void setMno(long mno) {
        Mno = mno;
    }


    void setAttendance(int attendance) {
        this.attendance = attendance;
    }


  void setMarks(int marks) {
        this.marks = marks;
    }


    // Setter Method
    void setName(String n){
        name = n;
    }
    

}
