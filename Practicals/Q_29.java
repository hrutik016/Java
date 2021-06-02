public class Q_29 {
    int a = 50;

    Q_29(){
        System.out.println("Practical 29 constructor using SUPER");
    }
    void msg(){
        System.out.println("Practical 29 using SUPER");
    }
    public static void main(String[] args) {
        People st = new People();
        st.display();
    }
}

class People extends Q_29{
    int a = 100;
    
    People(){
        super();
        System.out.println("People class constructor");
    }
    void msg(){
        System.out.println("This is Student class");
    }
    void display(){
        msg();
        super.msg();
        System.out.println("total no of people using SUPER: " + super.a);
    }
}
