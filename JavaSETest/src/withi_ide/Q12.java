package withi_ide;

public class Q12 {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        int[] copy = new int[array.length-1];
        int position=3;

        for(int i=0,k=0;i<array.length;i++){
            if(position==i){
                continue;
            }
            copy[k++]=array[i];
        }

        for(int check:copy){
            System.out.println(check);
        }
    }
}
