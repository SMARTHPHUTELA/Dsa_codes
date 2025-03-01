package arrays;

public class sigma6 {
    public static void swap(int[]arr,int i1,int i2){
        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }

    public static void sort(int[]arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }

        }
    }

    public static int[] square_nondec(int[]arr){
        int n=arr.length;
        int left=0;
        int right=arr.length-1;
        int[]ans=new int[n];
        int k=n-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;

     }
     public static void even_odd_sort(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]%2!=0 && arr[j]%2==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2!=0){
                j--;
            }
        }
     }
    public static void main(String[] args) {
        int[]arr={10,5,2,1,4,9};
        // sort(arr);
    //    int[]ans= square_nondec(arr);
        sigma5.disp_Array(arr);
        even_odd_sort(arr);
        sigma5.disp_Array(arr);

    }
    
}
