package oops;

public class scam3 {
    int a;
    void print1(int a){
        System.out.println(a+" "+this.a);
    }
    void print2(int a){
        System.out.println(this.a);
    }
    scam3(int a){
        this.a=a;
    }

    public static void main(String[] args) {
        scam3 s1=new scam3(7);
        s1.print1(8);
        // s1.print2(8);
    }
    
}
