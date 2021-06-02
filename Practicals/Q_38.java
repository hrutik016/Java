class MyThreadByExtending extends Thread{
    public void run () {
        System.out.println("Hello World! by" + Thread.currentThread());
    }
}

class MyThreadByImplementing implements Runnable{
    public void run () {
        System.out.println("Hello World! by" + Thread.currentThread());
    }
}

public class Q_38 {
    public static void main(String[] args) {
        MyThreadByExtending thread1 = new MyThreadByExtending();
        
        thread1.start();

        MyThreadByImplementing myThreadByImplementing = new MyThreadByImplementing();

        Thread thread2 = new Thread(myThreadByImplementing);

        thread2.start();
    }
}
