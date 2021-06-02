import edu.umd.cs.findbugs.annotations.NonNull;

public class Q_39 {
    static int sum = 0;
    static int i = 0;
        
    public Q_39 (){        
    }

    public Q_39 (@NotNull String name){
        super(name);
    }

    public void run(){
        for(;i<=100;i++){
            sum += i;
            System.out.println(Thread.currentThread().getName() + " --> " + sum);
        }        
    }

    public static void main(String[] args) {
       Q_39 t1 = new Q_39("Thread 1");
       Q_39 t2 = new Q_39("Thread 2");
       Q_39 t3 = new Q_39("Thread 3");
       Q_39 t4 = new Q_39("Thread 4");

       t1.start();
       t2.start();
       t3.start();
       t4.start();

       while(Thread.activeCount() > 1);
       System.out.println("Sum: " + sum);
    }
}
