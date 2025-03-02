package basics;

// import java.util.Scanner;

public class pass {
    public String str="its running";
    void start(){
        System.out.println("lets go");

    }
    public static void main(String[] args) {
        // pass obj1=new pass();
        pass2 object =new pass2();
        object.wpoc();

       
    }
    
}
class pass2{
   void wpoc(){
    pass obj =new pass();
    System.out.println("within package outside class "+ obj.str);

   }
   

}
