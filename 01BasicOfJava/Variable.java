public class Variable {
    // datatype VariableName;
    // Number
    // bit -0 /1 - 1 bit
    public static void main(String[] args) {
        
        // Builtin Data type
        // integer
        // byte
        byte num1=127;
        byte num2 = -128;
        //short
        short num3=32767;
        short num4= -32768;

        // int 
        int num5= 2147483647;
        int num6= -2147483648;

        // long
        long num7=9223372036854775807l;
        long num8= -9223372036854775808l;

        // floating Number
        double num9=1.7976931348623157E308;
        float  num10=3.4028235E38f;

        // Alphabetic
        // Character
        char chr='A';
        String  ch2="2kgg";// Non built-in

        // Boolean
        boolean bool=true;
        boolean boll2=false;


        // Non - Built-in Datatype

        // Object
        Object  obj="a";
        Object obj2=12345678;
        Object obj3 =23456.234567;
        // Object boolean=false;  // object can't boolean

        // Array
        int[] arr=new int[5];
        float[] arr2=new float[7];
        char[] chrrr=new char[3];
 

        System.out.println(ch2);
        System.out.println(num4);

        System.out.println(arr); // array can't print value like this, this will return address of memory


    }
   

    
}
