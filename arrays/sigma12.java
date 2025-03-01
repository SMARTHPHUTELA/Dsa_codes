package arrays;

public class sigma12 {
    public static void swap1d(int[]arr,int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
    public static void swap2d(int[][]arr,int idx1,int idx2){
        int temp=arr[idx1][idx2];
        arr[idx1][idx2]=arr[idx2][idx1];
        arr[idx2][idx1]=temp;
    }
    public static void reverse2d(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap1d(arr, i, j);
            i++;
            j--;
        }
    }
    public static void rotate_matrix(int[][]arr){
        int r=arr.length;
        @SuppressWarnings("unused")
        int c=arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {
                swap2d(arr,i,j);
            }
        }
        for(int i=0;i<r;i++){
            reverse2d(arr[i]);
        }
    }
    public static void disp2d(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void waveform_print(int[][]arr){
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                if(j%2==0){
                    reverse2d(arr[j]);
                }
            }
        }
        for(int j=arr[0].length-1;j>=0;j--){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        disp2d(arr);
        // rotate_matrix(arr);
        // disp2d(arr);
        waveform_print(arr);
        

       
        


    }
}
