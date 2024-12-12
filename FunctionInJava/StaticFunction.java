package FunctionInJava;

public class StaticFunction {

    static String HelloWorld(){
        return "Hello World";
    }
    static int sum(int a,int b){
            return a+b;
    }



    public static void main(String[] args) {
        String msg=HelloWorld();
        int sum=sum(7,9);
        System.out.println(msg);
        System.out.println(sum);
    }
    
}
