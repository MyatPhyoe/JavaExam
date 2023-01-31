public class Q2 {
    public static void main(String[] args) {
        AbstractData data = new AbstractData() {
            @Override
            void addion() {
                System.out.println("Abstract Checking");
            }
        };

        data.addion();

    }
}

abstract class AbstractData{
    abstract void addion();
}
