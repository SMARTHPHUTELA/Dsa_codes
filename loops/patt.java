package loops;

import java.util.Scanner;

public class patt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //                   PATTERN(desi method)
        int rows = 4;
        
        for(int i=1;i<=rows;i++){
            switch(i){
                case 1:
                System.out.println("****");
                break;

                case 2:
                System.out.println("***");
                break;

                case 3:
                System.out.println("**");
                break;

                case 4: 
                System.out.println("*");
                break;
                
                default:


            }

        }

        //                     PATTERN(orignal)


        // System.out.println("Enter the number of rows u want : ");
        // int n= sc.nextInt();
        // for(int i = 1;i<=n;i++){
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        //                    addition of stream of numbers

        // System.out.println("ENter the numbers");
        // int n=sc.nextInt();
        // int sum= 0;
        // while(n!=-1){
        //     sum=sum+n;
        //     n=sc.nextInt();
        // }
        // System.out.println(sum);


        //                        

        // for(int i= 1; i<=100;i++){
        //     if(i%5==0 && i%7==0){
        //         System.out.println("this is the number "+i);
        //         break;
        //     }
        // }


        //    patternssss


        // System.out.print("Enter the number of rows: ");
        // int r =sc.nextInt();
        // System.out.println("Enter the number of column: ");
        // int c =sc.nextInt();
        // for(int i =1;i<=r;i++){
        //     for(int j =1;j<=c;j++){
        //         if((i>1 && i<r) && (j>1 && j<c)){
        //             System.out.print(" ");
        //             continue;
        //         }
        //          System.out.print(j);
        //     }
        //     System.out.println("");
            
        // }


        int r=3;
        for(int i=1;i<=r;i++){
            for(int j = 1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++){
                //       NO NEED OF THIS PART
                // if((i==2&&i==3) && (k==2||k==3||k==4)){
                //     System.out.print(" ");
                // }
                System.out.print("$");

            }
            System.out.println();
            
        }



        // System.out.println("Enter the number of rows");
        // int r = sc.nextInt();
        // for (int i = 1;i<=r;i++){
        //     for (int j = 1;j<=r-i;j++){
        //         System.out.print(" ");
        //     }
        //     for (int k = 1;k<=2*i-1;k++){
        //         if(k==2*i-1||i==r||k==1){
        //         System.out.print(i);
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // System.out.print(" Enter the rows : ");
        // int r =sc.nextInt();
        for(int i =r-1;i>0;i--){
            for(int j=r-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=(2*i)-1;k>0;k--){
                System.out.print("$");
            }
            System.out.println();

        }
        sc.close();



        
        
        
    }
    

    
}
