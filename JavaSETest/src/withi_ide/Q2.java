package withi_ide;

public class Q2 {
    public static void main(String[] args) {
        int a=10; int c;
        int b=20;

        c=a;a=b;b=c;
        System.out.println("a value is "+a);//a value become 20
        System.out.println("b value is "+b); // b valus become 10
    }
}
