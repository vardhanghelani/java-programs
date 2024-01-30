import java.util.Scanner;
class ThisDemo {
    
    static int a=10;
     int b=20;
    public static void main(String[] args) {
        int c;
        int d;
        Scanner st=new Scanner(System.in);
        System.out.println("enter numbers");
        c=st.nextInt();
        d=st.nextInt();
      ThisDemo t= new ThisDemo(c,d);
    }
    ThisDemo(int a,int b){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(this.b);
    }
    
}