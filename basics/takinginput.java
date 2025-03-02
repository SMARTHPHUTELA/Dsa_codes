package basics;
import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = sc.nextInt();
        double pi =3.1415;
        double area= pi*r*r;
        System.out.println("The radius of circle is : "+area);

        // int x=sc.nextInt();
        // if(x>10){
        //     System.out.println("best");

        // }
        // if(x>5){
        //     System.out.println("better");

        // }
        // else{
        //     System.out.println("good");
        // }
        sc.close();
        
    }
    
}
