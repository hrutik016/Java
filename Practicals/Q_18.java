import java.util.StringTokenizer;
class Q_18 {
    public static void main(String args[]){
        
        System.out.println("Demo for String Buffer Class.\n");
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println(sb);
        sb.append("World ");
        System.out.println(sb);
        sb.insert(6, "Java ");
        System.out.println(sb);
        sb.replace(6,11,"");
        System.out.println(sb);
        sb.delete(5,11);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.append("this is Java.");

        System.out.println(sb);
        System.out.println(sb.substring(3));

        System.out.println("\nDemo for String Tokenizer Class.\n");
        StringTokenizer st = new StringTokenizer("Hello this is Java string.", " ");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer("\nHello/this/is/Java string.", "/",true);

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }    
}