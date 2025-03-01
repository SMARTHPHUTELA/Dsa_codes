package arrays;

public class sigma11 { 
    public static void second_large(int[]arr){
        int max=arr[0];
        int sec_max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i]>sec_max){
                sec_max=arr[i];
            } 
        }
        System.out.println(sec_max);
    }
    public static void main(String[] args) {
        int[]arr={500,500,2,501,3,4,67,6,677};
        second_large(arr);
    }
    
}
