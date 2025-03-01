package arrays;

public class assignment0 {
    public static void print_patt_matrix(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==arr.length/2 || j==arr[0].length/2){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static boolean monotonic_def(int[]arr){
        boolean asc=true;
        boolean desc=true;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                asc=false;
            }
            if(arr[i]<arr[i+1]){
                desc=false;
            }
        }
        if(asc==true || desc==true){
            return true;
        }
        return false;
    }
    public static void rotate_anticlockwise(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length/2;i++){
                int temp=arr[i][j];
                arr[i][j]=arr[arr.length-1-i][j];
                arr[arr.length-1-i][j]=temp;
            }
        }
    }
    public static void print_daigonal(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j || i+j==arr.length-1){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int[][]arr={{1,2,4,5,0},{3,6,7,9,8},{3,7,4,1,6},{1,2,3,4,4},{7,9,8,0,9}};
        // System.out.println(arr.length);
        // System.out.println(arr[0].length);
        // sigma12.disp2d(arr);
        // rotate_anticlockwise(arr);
        sigma12.disp2d(arr);

        print_patt_matrix(arr);
        // sigma12.disp2d(arr);

        // print_daigonal(arr);
    }
    
}
