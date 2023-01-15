package without_ide;

public class Q10 {
    public static void main(String[] args) {
        int[] array={5,4,1,8,6,9};
        int check= 0;

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    check= array[i];
                    array[i]=array[j];
                    array[j]=check;
                }
            }
        }

        for(int foreach: array){
            System.out.print(foreach);
        }
    }
}
