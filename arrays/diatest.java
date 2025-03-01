package arrays;
class angel{
    int a;
    int b;
    angel(int a,int b){
        this.a=a;
        this.b=b;
    }

}

public class diatest {
    angel head=new angel(1,2);
    angel temp=head;
    void disp(){
        head.a=6;
        System.out.println(head.a);
    }
    
    public static void main(String[] args) {
        diatest l1=new diatest();
        System.out.println(l1.temp.a);
        l1.disp();
    
}

    
}