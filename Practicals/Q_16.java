class Q_16 {
    public static void main(String args[]){
        
    float primearr[][] = new float[3][];
    primearr[0] = new float[1];
    primearr[1] = new float[2];
    primearr[2] = new float[3];

    primearr[0][0]= (float) 50.5;
    primearr[1][0]= (float) 500.1;
    primearr[1][1]= (float) 70.70;
    primearr[2][0]= (float) 100.9;
    primearr[2][1]= (float) 0.5;
    primearr[2][2]= (float) 20.02;

    System.out.println("Array length: "+primearr.length);
    System.out.println(primearr[0][0]);
    System.out.println(primearr[1][0]);
    System.out.println(primearr[1][1]);
    System.out.println(primearr[2][0]);
    System.out.println(primearr[2][1]);
    System.out.println(primearr[2][2]);
    }
}