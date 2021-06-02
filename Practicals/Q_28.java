public class Q_28 {
    public static void main(String[] args) {
        abstract class test{

            abstract void callme();
            void callmetoo(){
                System.out.println("My name is Ketul.");
            }
        }
        class test2 extends test{
            void callme() {
                System.out.println("My name is abstractKetul.");
            }
        }
        
        public class Q_28{
            public static void main(String[] args) {
                test2 t1 = new test2();
                t1.callmetoo();
                t1.callme();
            }
        }
    }
}
