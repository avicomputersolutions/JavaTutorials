public class Interger implements Formula{
    int a;
    int b;

    Interger(int a, int b){
        this.a = a;
        this.b = b;

    }

    public void sum(){
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