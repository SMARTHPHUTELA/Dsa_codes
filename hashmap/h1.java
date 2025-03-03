package hashmap;

import java.util.HashMap;

public class h1 {
    public static void check_count(int[]arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=1;
        // mp.put(arr[0],count);
        for(int i=0;i<arr.length;i++){
            boolean exist=mp.containsKey(arr[i]);
            if(exist==true){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],count);
            }
        }
        System.out.println(mp.entrySet());
        int max_val=Integer.MIN_VALUE;
        int anskey=Integer.MIN_VALUE;
        // for(var e:mp.entrySet()){
        //     if(e.getValue()>max_val){
        //         max_val=e.getValue();
        //         anskey=e.getKey();
        //     }
        // }
        for(var key:mp.keySet()){
            if(mp.get(key)>max_val){
                max_val=mp.get(key);
                anskey=key;
            }
        }
        System.out.println("MOST repeated element: "+anskey+" and it is repeated: "+max_val+" times");
        // System.out.println(mp.get(mp));
            
            
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,1,1,4,2};
        check_count(arr);
        
    }
    
}
