public class Q4 {
    public static void main(String[] args) {
        A adata=new A();
        adata.addion(10,20);

        B bdata=new B();
        bdata.addion(20,30);

        C cdata=new C();
        int a = cdata.a;
        int b= cdata.b;
        System.out.println("Class C data "+ (a+b));
    }
}

interface AB{
    int addion(int a, int b);
}
class A implements AB{

    @Override
    public int addion(int a, int b) {
       // System.out.println("Class A data "+ (a+b));
        return 500;
    }
}

class B implements AB{
    @Override
    public int addion(int a, int b) {
       // System.out.println("Class B data "+ (a+b));
        return 300;
    }
}

class C{
    int a= new A().addion(5,4);
    int b=new A().addion(5,4);
}
