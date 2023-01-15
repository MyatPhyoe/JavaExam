package withi_ide;

public class Q7 {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6};

        for(int foreach:number){
            System.out.print(foreach+ " ");
        }
        System.out.println();

        for(int i=0;i<number.length;i++){
            System.out.print(number[i]*2+" ");
        }
    }
}
