public class Q6 {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{
            int check=a/b;
            System.out.println(check);
        }catch (ArithmeticException AE){
            System.out.println("Arithmetic Exception Error");
        }catch (NullPointerException NE){
            System.out.println("Null Exception Error");
        }catch (Exception E) {
            System.out.println("Exception Error");
        }
    }
}
