package withi_ide;

public class Q14 {
    public static void main(String[] args) {
        int[] number ={10,20,30,40};
        int sum=0;

        for(int i=0; i<number.length;i++){
            sum=number[i]+sum;
        }

        System.out.println(sum);
    }
}
