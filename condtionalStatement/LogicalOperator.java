package condtionalStatement;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean loggedIn=true;
        // boolean sessionExpired=true;
        boolean cookies=true;

        // if(loggedIn == true && sessionExpired ==true){
        //     System.out.println("Continue");
        // }else{
        //     System.out.println("Please login first");
        // }

        // if (loggedIn ==true || cookies ==true){
        //     System.out.println("DashBoard");
        // }else{
        //     System.out.println("Login page");
        // }

        if(!loggedIn){
            System.out.println("Login page");
        }else{
            
            System.out.println("DashBoard");
        }

    }
}
