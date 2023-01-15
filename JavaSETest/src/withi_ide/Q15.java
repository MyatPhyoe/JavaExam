package withi_ide;

public class Q15 {
    public static void main(String[] args) {
        int[] number ={1,2,3,4,5,6,7,8};
        int sum=0;

        for(int i=0; i<number.length;i++){
            if(number[i]%2!=0) {
                System.out.println(number[i] + "  is odd number");
            }
        }
    }
}
