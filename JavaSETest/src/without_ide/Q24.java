package without_ide;

public class Q24 {
    public static void main(String[] args) {
        int row=5;

        for(int i=1;i<=row;i++){
           int value=0;
            for(int j=1;j<=i;j++){
                System.out.print(value+j);
            }
            System.out.println();
        }
    }
}
