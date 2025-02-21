package loops;

import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //                    //REVERSE A NUMBER//

        //              M1(for loop)

        // System.out.println("Enter the number : ");
        // int n =sc.nextInt();
        // int x=0;
        // for(int i= n; i>0;i=i/10){
        //     x=x*10+i%10;
        // }
        // System.out.println(x);


        //              M2(while loop)

        // int n =sc.nextInt();
        // int x=0;
        // while(n>0){
        //     x=x*10+n%10;
        //     n/=10;
        // }
        // System.out.println(x);


        //               M3(string)

        // int num= sc.nextInt();
        // String sh=" ";
        // while (num>0){
        //     sh=sh+(num%10);
        //     num=num/10;
        // }
        // System.out.println("reverse of number is "+sh);


        //              program for (1-2+3-4....n)

        System.out.print("Enter the number upto which series continues : ");
        int n= sc.nextInt();
        int sum =0;
        for(int i =1;i<=n;i++){
            if(i%2==0){
                sum=sum-i;
                
            }
            else{
            sum=sum+i;
            } 

        }
        System.out.println(sum);


        //                     factorial( )


        // System.out.print("Enter the number : ");
        // int n =sc.nextInt();
        // int fac=1;
        // for(int i =1;i<=n;i++){
        //     fac=fac*i;
        //     System.out.println(fac);
        // }
        // System.out.println(fac);



        //                      a raise to power b

        // int a=sc.nextInt();
        // int b =sc.nextInt();
        // int ans=1;
        // int i =1;
        // while(i<=b){
        //     ans=ans*a;
        //     i++;

        // }
        // System.out.println(ans);


        // int a= sc.nextInt();
        // int b=sc.nextInt();
        // int ans =1;
        // for(int i=1;i<=b;i++){
        //     ans=ans*a;

        // }
        // System.out.println(ans);
        sc.close();



        





    }
    
}
