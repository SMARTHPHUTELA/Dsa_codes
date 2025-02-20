package sorting;

import arrays.sigma5;

public class mergesort {
    public static void merge(int[]arr,int idx1,int mid,int idx2){
        int n1=mid-idx1+1;
        int n2=idx2-mid;
        int[]left=new int[n1];
        int[]right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[idx1+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        int m=0;
        int n=0;
        int k=idx1;
        while(m<n1 && n<n2){
            if(left[m]<=right[n]){
                arr[k++]=left[m++];
            }
            else{
                arr[k++]=right[n++];
            }
        }
        while(m<n1){
            arr[k++]=left[m++];
        }
        while(n<n2){
            arr[k++]=right[n++];
        }

    }
    public static void sort3(int[]arr,int idx1,int idx2){
        int mid=(idx1+idx2)/2;
        if(idx1>=idx2){
            return;
        }
        sort3(arr,idx1,mid);
        sort3(arr,mid+1,idx2);
        merge(arr,idx1,mid,idx2);
    }

    public static void main(String[] args) {
        int[]arr={3,4,4,2,1};
        System.out.println("ARRAY before sorting ");
        sigma5.disp_Array(arr);
        sort3(arr, 0, arr.length-1);
        System.out.println("ARRAY AFTER SORTING ");
        sigma5.disp_Array(arr);

    }
    
}
