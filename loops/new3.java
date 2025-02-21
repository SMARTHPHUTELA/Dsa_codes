package loops;

import java.util.Scanner;

public class new3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the upper limit: ");
        int x=sc.nextInt();
        int i=0;
        while(i<x){
            i++;
            if(i%3==0){
                continue;
            }
            System.out.print(i+" ");
            
            
        }
        sc.close();
    }
    
}
