package sorting;

import arrays.sigma5;

public class quicksort {
    public static int partition(int[]arr,int idx1,int idx2){
        int pivot=arr[idx1];
        int count=0;
        for(int i=idx1+1;i<=idx2;i++){
            if(arr[i]>=pivot){
                count++;
            }
        }
        int pivot_index=idx1+count;
        sigma5.swap(arr,idx1,pivot_index);
        int i=idx1;
        int j=idx2;
        while(i<pivot_index && j>pivot_index){
            
            while(arr[i]>=pivot){
                i++;
            }
            while(arr[j]<pivot){
                j--;
            }
            if(i<pivot_index && j>pivot_index){
                sigma5.swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivot_index;

    }
    public static void sort4(int[]arr,int idx1,int idx2){
        if(idx1>=idx2){
            return;
        }
        int pi=partition(arr,idx1,idx2);
        sort4(arr,idx1,pi-1);
        sort4(arr,pi+1,idx2);

    }
    public static void main(String[] args) {
        int[]arr={0,2,4,1,2,9,3};
        sort4(arr, 0, arr.length-1);
        sigma5.disp_Array(arr);
        
    }
    
}
