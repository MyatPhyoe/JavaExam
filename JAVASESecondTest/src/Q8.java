public class Q8{
    public static void main(String[] args) {
        LamdaInterface question =(a,b)->{
            System.out.println("Adding is "+(a+b));
        };

        question.add(100,200);
    }
}

interface LamdaInterface{
    void add(int a, int b);
}
