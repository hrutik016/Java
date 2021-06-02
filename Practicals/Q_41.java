public class Q_41 extends Thread {
    @Override
    public void run(){
        System.out.println("Hello from " + Thread.currentThread().getName() + " with Priority " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Q_41 t1 = new Q_41();
        t1.setName("First");
        t1.setPriority(3);

        Q_41 t2 = new Q_41();
        t2.setName("Second");
        t2.setPriority(5);

        Q_41 t3 = new Q_41();
        t3.setName("Third");
        t3.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
    }
}
