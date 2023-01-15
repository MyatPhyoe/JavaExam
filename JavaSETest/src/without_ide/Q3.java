package without_ide;

public class Q3 {
    public static void main(String[] args) {
        int[] number = {23,24,12,78,62,100,200,80,75,4,80,500,72,6,11};
        int check=number[0];

        for(int i=0; i<number.length; i++){
           for(int j=i+1;j<number.length;j++) {
               if (check < number[j]) {
                   check = number[j];
               }
           }
        }
        System.out.println(check);// Result is 500
    }
}
