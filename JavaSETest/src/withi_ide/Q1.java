package withi_ide;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Please add factorial number");
        Scanner number = new Scanner(System.in);
        int data = number.nextInt();
        int factorial =1;

        for(int i=1;i<=data;i++){
            factorial=factorial * i;
        }
       System.out.println(data+ "of Factorial value is "+ factorial);
    }
}
