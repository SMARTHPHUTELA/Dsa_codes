package sorting;

import arrays.sigma5;

public class bubblesort {

    public static void swap(int[]arr,int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }

    public static void sort1(int[]arr){
       
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=true;
                }
            }
            if(flag==false){
                return;
            }
            
        }
    }

    public static void main(String[] args) {
        int[]arr={7,1,2,3,4};
        sort1(arr);
        sigma5.disp_Array(arr);
    }
    
}
