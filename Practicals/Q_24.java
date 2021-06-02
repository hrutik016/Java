class Static{
    int a = 5;
    static int b = 7;
    int c;

    void accessA(int c){
        System.out.println("A = " + a);
        this.c = c;
        System.out.println("product = " + c*a);
    }
}

class Q_24 
{
    public static void main(String args[]){
        Static st = new Static();
        st.accessA(5);

        System.out.println("B = "+ Static.b);
    }
   
}