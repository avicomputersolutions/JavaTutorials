package NumberTheory;

public class SunnyNumber {
    public static void main(String[] args) {
        int number=24;
        int next=number+1;
        boolean PerfectSquare=false;
        for(int i=2;i<next;i++){
            if( i*i==next){
                PerfectSquare=true;
                break;
            }
        }

        if(PerfectSquare){
            System.out.println("Sunny");
        
        }else{
            System.out.println("Not a SunnyNumber");
        }
    }
}
