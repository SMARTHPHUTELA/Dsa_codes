package arrays;

public class sigma9 {
    @SuppressWarnings("unused")
    public static void zEROoneTWO(int[]arr){
        int no_of_0=0;
        int no_of_1=0;
        int no_of_2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                no_of_0++;
            }
            else if(arr[i]==1){
                no_of_1++;
            }
            else{
                no_of_2++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i<no_of_0){
                arr[i]=0;
            }
            else if(i<no_of_0+no_of_1){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={0,1,2};
        zEROoneTWO(arr);
        sigma5.disp_Array(arr);
    }
  

}
