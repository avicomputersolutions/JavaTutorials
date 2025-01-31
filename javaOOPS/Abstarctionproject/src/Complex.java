public class Complex extends AbstractClass{
    int real;
    int img;
    String symbol;

    Complex(int real,int img,String symbol){
        this.real = real;
        this.img = img;
        this.symbol = symbol;
    }

    @Override
    void sum() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // void sum(Complex a, Complex b){
    //     int real = a.real + b.real;
    //     int img = a.img + b.img;
    //     System.out.print(real +symbol + "i"+img);
    // }

    void print(Object a, Object b) {
        System.out.print(a + " " +b);
    }   

   


   
}