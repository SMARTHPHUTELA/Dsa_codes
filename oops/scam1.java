
package oops;

class Pfp{
    int a;
    String b;
    //  COPYING CONSTRUCTORS  
    Pfp(Pfp px){
        this.a=px.a;
        this.b=px.b;

    }
    Pfp(int a,String b){
        this.a=a;
        this.b=b;

    }
    void printing(){
        System.out.println(a+this.b);
    }

    
}

public class scam1 {
    public static void main(String[] args) {
        Pfp p1=new Pfp(212,"smarth");
        Pfp p2=new Pfp(58,"dia");
        Pfp p3=new Pfp(p2);
        p3.printing();
        p2.printing();
        p1.printing();
        p3.b="DIA";
        p3.printing();
    }
    
}
