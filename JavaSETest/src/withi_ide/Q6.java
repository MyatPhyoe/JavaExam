package withi_ide;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter number: one, two or three.");
        Scanner number = new Scanner(System.in);
        String data = number.next();

        switch(data){
            case "one": System.out.println("It is one.");break;
            case "two": System.out.println("It is two.");break;
            case "three": System.out.println("It is three.");break;
            default:System.out.println("No number.");
        }
    }
}
