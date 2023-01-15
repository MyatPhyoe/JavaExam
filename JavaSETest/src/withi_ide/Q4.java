package withi_ide;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Insert the exam mark");

        Scanner number = new Scanner(System.in);
        int data = number.nextInt();
        int value =0;
        boolean check=true;

        while(check) {
            if (data <= 100) {
                if (data < 40) {
                    System.out.println("Exam Fail.");
                } else if (data >= 40 && data < 80) {
                    System.out.println("Exam Pass");
                } else {
                    System.out.println("Exam Pass with destination");
                }
                check=false;
            }else {
                System.out.println("Please insert the valid mark.");
                data = number.nextInt();
            }
        }
    }
}
