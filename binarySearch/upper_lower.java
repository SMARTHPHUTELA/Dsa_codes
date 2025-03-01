package binarySearch;

public class upper_lower {
    public static void lower(int[]arr,int target){
        int lb=arr.length;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]>=target){
                // lb=Math.min(lb,mid);
                lb=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(lb);
    }

    public static void upper(int[]arr,int target){
        int lb=arr.length;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                lb=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(lb);
    }
    public static void main(String[] args) {
        int[]arr={10,13,25,25,46,56,77};
        upper(arr, 25);
    }
    
}
