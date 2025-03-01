package arrays;
import java.util.Arrays;

import java.util.Scanner;

public class sigma3 {
    static String sort(int[]arr){
        String str="array is sorted"; 
       for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1]){
            str="array is not sorted";
            break;
        } 
       } 
       return (str);
    }
    static void find(int[]arr,int x){
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;
            }
        }
        if(ans!=-1){
            System.out.println("found at index: "+ans);
        }
        else{
            System.out.println("NOT present in array !");
        }
    }
    
    // static int[] ReturnArr(int[]){

    // }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[]arr1={1,4,2,3};
        System.out.println(sort(arr1));
        System.out.println("enter element to be found: ");
        int a=sc.nextInt();
        find(arr1,a);
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        sc.close();
    }
    
}
