public class Q3 implements Addition,Multiply {

    @Override
    public void add(int a, int b) {
        System.out.println("Adding is "+(a+b));
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println("Multiply is "+(a*b));
    }
    public static void main(String[] args) {
        Q3 check=new Q3();
        check.add(10,20);
        check.multiply(10,20);
    }
}

interface Addition{
    void add(int a, int b);
}

interface Multiply{
    void multiply(int a, int b);
}
