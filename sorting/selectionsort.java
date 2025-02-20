package sorting;

import arrays.sigma5;

public class selectionsort {
    static void sort2(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            bubblesort.swap(arr,i,min_idx);
        }
    }
    static void sort2_particular(int[]arr,int idx1,int idx2){
        for(int i=idx1;i<=idx2;i++){
            int min_idx=i;
            for(int j=i+1;j<=idx2;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            sigma5.swap(arr, i, min_idx);
        }
    }
    public static void main(String[] args) {
        int[]arr={7,5,8,3,4};
        // sort2(arr);
        sort2_particular(arr, 1, 3);
        sigma5.disp_Array(arr);

    }
    
}
