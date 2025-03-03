package hashmap;

import java.util.HashMap;

// import arrays.sigma5;

public class approach2 {
    public static Integer[] two_sum(int[]arr,Integer target){
        HashMap<Integer,Integer> mp=new HashMap<>();
        Integer[]ans={-1};
        for(int i=0;i<arr.length;i++){
            Integer partner=target-arr[i];
            boolean exist=mp.containsKey(partner);
            if(exist==false){
                mp.put(arr[i],i);
            }
            else{ 
                ans=new Integer[]{arr[i],partner};
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={1,4,6,3,3,7,11,4,8};
        Integer[]ans=two_sum(arr, 15);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
    
}
