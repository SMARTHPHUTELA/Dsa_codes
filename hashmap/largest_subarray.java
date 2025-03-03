package hashmap;

import java.util.HashMap;

public class largest_subarray {
    public static int subarray(int[]arr){
        int pre_sum=0;
        int max_len=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];
            boolean exist=mp.containsKey(pre_sum);
            if(exist==false){
                mp.put(pre_sum,i);
            }
            else{
                max_len=Math.max(max_len,i-mp.get(pre_sum));
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int []arr={15,-2,2,-8,1,7,10};
        int ans=subarray(arr);
        System.out.println(ans);
    }
    
}
