package sorting;

import arrays.sigma5;

public class insertsort {
    public static void sort3(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){ 
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                sigma5.swap(arr, j, j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={8,5,6,7};
        sort3(arr);
        sigma5.disp_Array(arr);

    }
    
}
