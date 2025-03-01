package arrays;
public class sigma7 {


    //       PREFIX SUM USING DIFFERENT ARRAY 
    public static int[] PREFIX_SUM(int[]arr){
        int n=arr.length;
        int[]ans=new int[n];
        int k=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            ans[k++]=sum;
        }
        return ans;
    }
    //        PREFIX  / SUFIX   SUM USING SAME ARRAY(   IN    PLACE   )
    public static void Prefix_sum_2(int[]arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        sigma5.disp_Array(arr);
        
    }
    public static int[] Suffix_Sum(int[]arr){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];
        }
        return arr;
    }
    public static void sub_array(int[]arr){
        int[]prefix=PREFIX_SUM(arr);
        int[]suffix=Suffix_Sum(arr);
        for(int i=0;i<arr.length-2;i++){
            if(prefix[i]==suffix[i+1]){
                System.out.println();
                System.out.println("it can be distributed at index"+prefix[i]);
                return;
            }
            
        }
        System.out.println(" CANNOT BE DISTRIBUTED ");
    }

                       //  MONO TONIC ARRAY

    public static void monotonic(int[]arr){
        boolean A=true;
        boolean B=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                A=false;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                B=false;
            }
        }
        if(A==true || B==true){
            System.out.println("ARRAY is monotonic ");
        }
        else{
            System.out.println("ARRAY is not monotonic");
        }
        
    }

    //        MISSING NUMBER
    public static int SUM_OF_Nelements(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        return sum;

    }
    public static void missing_no(int[]arr){
        int sumOFelements=0;
        for(int i=0;i<arr.length;i++){
            sumOFelements=sumOFelements+arr[i];
        }
        int n=SUM_OF_Nelements(arr.length);
        int ans=n-sumOFelements;
        System.out.println("MISSING NUMBER : "+ans);
    }
    public static void zero_at_end(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }
            if(arr[i]!=0){
                i++;
            }
            if(arr[j]==0){
                j--;
            }

        }
    }
    public static void main(String[] args) {
        int[]arr={0,1,3,4};
        missing_no(arr);
        // zero_at_end(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // sub_array(arr);
        // sigma5.disp_Array(arr);
        
       
// 
        
        
        
    }
    
}
