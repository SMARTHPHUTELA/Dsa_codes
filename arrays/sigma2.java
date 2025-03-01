package arrays;

import java.util.Scanner;

public class sigma2 {
    static void occ(int[]arr){
        for(int i =0;i<arr.length;i++){
            arr[i]=0;
        }
    }
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        // System.out.println();
        
       
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[]abc={1,2,3,4};
        printArray(abc);
        System.out.println();
        occ(abc);
        printArray(abc);
        sc.close();
    }
    

   
    
}
