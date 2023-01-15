package withi_ide;

public class Q11 {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        int[] copy = new int[array.length-1];
        int delete=20;

        for(int i=0,k=0;i<array.length;i++){
            if(delete==array[i]){
                continue;
            }
            copy[k++]=array[i];
        }

        for(int check:copy){
            System.out.println(check);
        }
    }
}
