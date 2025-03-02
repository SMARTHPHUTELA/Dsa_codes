package conditional;
import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //               PROBLEM 1( profit OR loss )
        // int cp,sp,profit,loss;
        // System.out.println("enter the cost price : ");
        // cp=sc.nextInt();
        // System.out.println("enter the selling price : ");
        // sp=sc.nextInt();
        // if(sp>cp){
        //     System.out.println("yayy!! ITS PROFIT....");
        //     profit=sp-cp;
        //     System.out.println("The profit earned is : "+profit);

        // }
        // else{
        //     System.out.println("noo  ITS LOSS....");
        //     loss=cp-sp;
        //     System.out.println("The loss is : "+loss);
        // }


        //               PROBLEM 2 (weather number is 2 digit or not)


        // System.out.println("enter the number : ");
        // int n=sc.nextInt();
        // if(n>9 && n<100){
        //     System.out.println("its a 2 digit number ");

        // }
        // else{
        //     System.out.println("its any other number : ");
        // }
              

        //               PROBLEM 3(largest of 3 number )


        // System.out.println("enter 3 distinct numbers : ");
        // int x,y,z;
        // x=sc.nextInt();
        // y=sc.nextInt();
        // z=sc.nextInt();

        // if(x>y && x>z){
        //     System.out.println(x+" is the largest number ");

        // }
        // else if(y>x && y>z){

        //     System.out.println(y+" is the largest number ");

        // }
        // else{
        //     System.out.println(z+" is the largest number ");
        // }


       //                 PROBLEM 4


    //    System.out.print("enter the number : ");
    //    int x=sc.nextInt();
    //    if(x%3==0 || x%5==0){
    //     if(x%15!=0){
    //         System.out.println(x+" is the number divisible by 3 or 5 but not divisible by 15");
            
    //     }
    //     else{

        
    //      System.out.println(x+" is the number divisible by all 3 or 5 and 15 also");
    //     }
    //    }
    //    else{
    //     System.out.println("not divisibe by 3 or 5 ");
    //    }

    //            PROBLEM 5( largest of 3 number using nested if else)


          int x,y,z;
          System.out.println("enter  3 numbers: ");
          x=sc.nextInt();
          y=sc.nextInt();
          z=sc.nextInt();
          if(x>y){
            if(x>z){
                System.out.println(x+" is the largest");

            }
            else{
                System.out.println(z+" is the largest ");
            }
          }
          else{
            if(y>z){
                System.out.println(y+ "is the largest ");

            }
            else{
                System.out.println(z+" is the largest ");
            }
          }
          sc.close();


    }  
    
}
