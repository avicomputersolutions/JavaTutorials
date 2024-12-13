package condtionalStatement;

public class LeapYear {
 public static void main(String[] args) {
    int year=2023;

    // if(year % 100==0){
    //     if(year % 400==0){
    //         System.out.println("Leap Year");
    //     }else{
    //         System.out.println("Not a year");
    //     }
    // }else{
    //     if(year % 4==0){
    //         System.out.println("Leap year");
    //     }else{
    //         System.out.println("Not a leap year");
    //     }
    // }

    if( ( year % 100==0 && year % 400==0) ||  year % 4==0 ){
        System.out.println("Leap year");
    }else{
       
            System.out.println("Not a leap year");
        
    }
 }   
}
