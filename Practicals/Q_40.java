public class Q_40 extends Thread{
    static int counter = 0;
    public void run(){
        counter++;
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Q_40 t1 = new Q_40();
        t1.start();
    }
}
