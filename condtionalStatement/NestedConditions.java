package condtionalStatement;

public class NestedConditions {
    public static void main(String[] args) {
        boolean loggedIn=true;
        boolean sessionExpired=true;

        if(loggedIn == true){
            if( sessionExpired==false){
                System.out.println("Logged out");
            }else{
                System.out.println("continue to use ");
            }
        }else{
            System.out.println("Please login first");
        }
    }
}
