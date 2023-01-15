package withi_ide;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter Day");
        Scanner day = new Scanner(System.in);
        int data = day.nextInt();

        switch(data){
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("Friday");break;
            case 7: System.out.println("Satursday");break;

            default:System.out.println("No day");
        }
    }
}
