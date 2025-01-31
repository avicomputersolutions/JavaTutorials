public class App {
    public static void main(String[] args) throws Exception {
        Interger i = new Interger(7,8);
        i.sum();

        FloatCalculation f = new FloatCalculation(3.5, 4.5);
        f.sum();


        Complex c1 = new Complex(7,8,"+");
        Complex c2 = new Complex(5,6,"+");
        // c1.sum(c1, c2);
        
    }
}
