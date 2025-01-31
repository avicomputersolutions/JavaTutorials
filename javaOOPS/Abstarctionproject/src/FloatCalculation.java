public class  FloatCalculation implements Formula{
    double a;
    double b;
    
    FloatCalculation(double a, double b){
        this.a = a;
        this.b= b;
    }
    @Override
    public void sum() {
        System.out.println(a+b);
    }

    @Override
    public void minus() {
        System.out.println(a-b);
    }

    @Override
    public void multiply() {
        System.out.println(a*b);
    }
    
}