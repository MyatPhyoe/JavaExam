public class Q5 {
    static int A,B;

    public static int getA(){
        return (A+B);
    }

    public static void setA(int a, int b) {
        A = a;
        B = b;
    }

    public static void main(String[] args) {
        setA(10,20);
        int data = getA();
        System.out.println(data);
    }
}
