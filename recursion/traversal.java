package recursion;

public class traversal {
    public static void array_trav(int i,int[]arr){
        // if(i==0){
        //     System.out.print(arr[i]+" ");
        //     return;
        // }
        // array_trav(i-1, arr);
        // System.out.print(arr[i]+" ");
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        array_trav(i+1, arr);
    }
    public static void subset(int i,String s,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        subset(i+1, s, ans+s.charAt(i));
        subset(i+1, s, ans);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        array_trav(0, arr);

        
    }
    
}
