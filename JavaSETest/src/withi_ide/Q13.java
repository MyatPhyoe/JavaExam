package withi_ide;

public class Q13 {
    public static void main(String[] args) {
        //Still can not solve this problem
        int[] array={1,2,3,4,1,2,3};
        int[] data=new int[array.length];

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    continue;
                }
                data[i]=array[i];

            }System.out.println(data[i]);
        }

        for(int check:data){
           // System.out.println(check);//Error Error
        }
    }
}
