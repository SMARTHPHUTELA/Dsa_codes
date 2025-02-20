package sorting;

import arrays.sigma5;

public class ques1 {
    public static void zero_at_end(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0){
                    sigma5.swap(arr, j, j+1);
                }
            }
        }
    }
    // public static void selec_sort(String[]arr){
    //     int n=arr.length;
    //     for(int i=0;i<n-1;i++){
    //         int minidx=i;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[j].compareTo(arr[minidx])<0){
    //                 minidx=j;
    //             }
    //         }
    //         if(minidx!=i){
    //             String temp=arr[i];
    //             arr[i]=arr[minidx];
    //             arr[minidx]=temp;
    //         }
    //     }
    // }
    public static void main(String[] args) {
        // String[]arr={"kiwi","apple","mango","papaya"};
        // selec_sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int[]arr={0,1,1,0,2,3};
        zero_at_end(arr);
        sigma5.disp_Array(arr);

    }
    
}
