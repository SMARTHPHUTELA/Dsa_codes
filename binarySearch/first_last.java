package binarySearch;

public class first_last {
    public static void f_l_occurance(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        int first_o=-1;
        int last_o=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                first_o=mid;
                high=mid-1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                last_o=mid;
                low=mid+1;
                // if(arr[mid]==arr[mid+1]&& mid!=arr.length-1 ){
                //     low=mid+1;
                // }
                // else{
                //     last_o=mid;
                //     break;
                // }
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(first_o+" "+last_o);
    }

    public static void main(String[] args) {
        int[]arr={1,2,2,2,4,4,56,100,2333};
        f_l_occurance(arr, 4);
    }
    
}
