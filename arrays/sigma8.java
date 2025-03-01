package arrays;

public class sigma8 {
    //   NEXT GREATER ELEMENT
    public static void Nxt_grt_elm(int[]arr){
        for(int i=0;i<arr.length;i++){
            int ans=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>ans){
                    ans=arr[j];
                    break;
                }
            }
            if(arr[i]==ans){
                arr[i]=-1;
            }
            else{
                arr[i]=ans;
            }
        }
        
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,1,5,3,4,8};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        Nxt_grt_elm(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
