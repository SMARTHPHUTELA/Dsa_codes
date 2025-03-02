package oops;

public class scam2 {
    public static void main(String[] args) {
        star ob=new star(10, 20);
        ob.display();
        star2 ob1=new star2(10,20,30,40);
        ob1.display();
    }
    
}
class star{
    int A;
    int b;
    star(int a,int b){
        this.A=a;
        this.b=b;
    }
    void display(){
        System.out.println("a :"+A);
        System.out.println("b :"+this.b);
    }
}

class star2 extends star{
    int c;
    int d;
    star2(int a,int b,int c,int d){
        super(a, b);
        this.c=c;
        this.d=d;
    }
    void display2(){
        display();
        System.out.println("c :"+c);
        System.out.println("d :"+d);
    }
}