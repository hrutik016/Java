interface h1{
    int a = 1;
    public void dis();
}

interface h2 extends h1{
    public void dis();
}

interface h3 extends h2{
    public void dis();
}

class U implements h3{
    public void dis(){
        System.out.println("Value of interger: " + a);
    }
}

public class Q_31 {
    public static void main(String[] args) {
        U u1 =new U();
        u1.dis();
    }
}
