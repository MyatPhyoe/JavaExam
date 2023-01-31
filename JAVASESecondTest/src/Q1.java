public class Q1 extends LevelOne {
    public static void main(String[] args) {
        LevelThree three = new LevelThree();
        three.add(10,20);
        three.multiply(10,20);
        three.subtract(20,10);
    }
}

class LevelOne{
    void add(int a, int b){
        System.out.println("Adding is "+ (a+b));
    };
}

class LevelTwo extends LevelOne{
    void multiply(int a, int b){
        System.out.println("Multiply is "+a*b);
    };
}

class LevelThree extends LevelTwo{
    void subtract(int a, int b){
       if(a>b){
           System.out.println("Subtract is "+ (a-b));
       }else{
           System.out.println("Subtract is "+a);
       }
    };
}
