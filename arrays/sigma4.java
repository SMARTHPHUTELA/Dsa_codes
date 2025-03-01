package arrays;

public class sigma4 {
    static void unique(int[]arr){
        for(int i=0;i<arr.length;i++){
            int flag=0;
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                    arr[j]=Integer.MIN_VALUE;
                }
            }
            if(flag==1){
                arr[i]=Integer.MIN_VALUE;
            }
            
            
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=Integer.MIN_VALUE){
                System.out.println("Unique element found : "+arr[i]);
                return;
            }
        }
        System.out.println("NO unique");
        return;
    }
    static void secondMax(int[]arr){
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }
        arr[maxidx]=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==max){
        //         arr[i]=Integer.MIN_VALUE;
        //     }
        // }
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("SECOND MAX ELEMENT : "+max2);
        
    }
    static void repeat(int[]arr){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int flag=0;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans=arr[i];
                    flag=1;
                    
                }
            }
            if(flag==1){
                break;
            }
         
        }
        if(ans!=Integer.MIN_VALUE){
            System.out.println("first repeated element: "+ans);
        }
        else{
            System.out.println("no repeated element");
        }
    }

    static int secondSmall(int[]arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min2){
                min2=arr[i];
                // return min2;
            }
        }
        return min2;
    }
    public static void main(String[] args) {
        int[]abc={1,1,3,33,1,3,2,2};
        // unique(abc);
        secondMax(abc);
        // repeat(abc);
        // System.out.println("second smallest element: "+secondSmall(abc));

      
    }
   
}