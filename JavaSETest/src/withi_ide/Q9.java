package withi_ide;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        int [] number={1,2,3,4,5};

        System.out.println("Enter number to search it index");
        Scanner value = new Scanner(System.in);
        int data = value.nextInt();
        boolean check=true;

        for(int i=0; i<number.length;i++){
            if(data==number[i]){
                System.out.println("Number index is "+ number[i-1]);
                check=false;
            }
        }
        if(check==true){
            System.out.println("No Number");
        }
    }
}
