class Stack{
    int stck[] = new int[10];
    int tos;
    Stack(){
        tos =-1;
    }
    void push(int item){
        if(tos==9)
            System.out.println("Stack is full.");
        else
            stck[++tos]=item;
    }
    int pop(){
        if (tos<0){ 
            System.out.println("Stack UNDERFLOW");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class Q_22{
    public static void main(String args[]){
        Stack mystack = new Stack();
        for(int i=0; i<10; i++) mystack.push(i);
        System.out.println("My stack:");
        for(int i=0; i<10; i++) 
            System.out.println(mystack.pop());
    }   
}