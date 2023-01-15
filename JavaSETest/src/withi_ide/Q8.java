package withi_ide;

public class Q8 {
    public static void main(String[] args) {
        int[][] array={{1,2,3,4,5},
                {5,4,3,2,1},
                {7,8,9,1,5,7,7}};

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++) {
              System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
