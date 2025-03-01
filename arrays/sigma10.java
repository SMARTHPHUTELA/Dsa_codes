package arrays;

public class sigma10 {
    public static int[] merge_sorted_arrays(int[]arr1,int[]arr2){
        int length_final=arr1.length+arr2.length;
        int i=0,j=0,k=0;
        int[]arr3=new int[length_final];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k++]=arr1[i];
                i++;
            }
            else{
                arr3[k++]=arr2[j];
                j++;
            }
        }
        while(j<arr2.length){
            arr3[k++]=arr2[j];
            j++;
        }
        while(i<arr1.length){
            arr3[k++]=arr2[i];
        }
        return arr3;

    }
    public static int[] remove_conse_sequence(int[]arr){
        int[]new_arr=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]){
                    new_arr[k++]=arr[i];
                    continue;
                }
            }
            if(i==arr.length-1){
                if(arr[i]!=arr[i-1]){
                    new_arr[k++]=arr[i];
                    continue;
                }
            }
            if(arr[i]!=arr[i-1]  && arr[i]!=arr[i+1]){
                new_arr[k++]=arr[i];
            }
        }
        return new_arr;
    }
    public static void main(String[] args) {
        // int[]arr1={1,4,5,8};
        int[]arr2={0,1,1,1,2,3,3,4};

        // int[]arr3=merge_sorted_arrays(arr1, arr2);
        sigma5.disp_Array(arr2);
        sigma5.disp_Array(remove_conse_sequence(arr2));

    }
    
}
