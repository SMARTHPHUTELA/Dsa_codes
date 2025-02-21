package repeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;  
import arrays.sigma5;

public class master0 {
    public static int sum(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int multiply(int[]arr){
        int ans=1;
        for (int i = 0; i < arr.length; i++) {
            ans*=arr[i];
        }
        return ans;
    }
    public static void max(int[]arr){
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }
        System.out.println("MAX: "+max);
        System.out.println(" MAX idx: "+maxidx);
        
    }
    public static void secMAX(int[]arr){
        int max=0;
        int second_max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }
            else if(arr[i]>second_max){
                second_max=arr[i];
            }
        }
        System.out.println(second_max);
    }
    public static void prefixSUM(int[]arr){
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]=sum+arr[i];
            sum+=arr[i];
        }
    }
    public static void extreme_print(int[]arr){
        int i=0;
        int j=arr.length-1;
        while (i<=j) {
            if(i==j){
                System.out.print(arr[i]+" ");
                i++;
            }
            else{
            System.out.print(arr[i]+" ");
            System.out.print(arr[j]+" ");
            i++;
            j--;
            }
            
        }
    }
    public static void swap_no(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void swap_no_arr(int[]arr,int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
    public static int sum_n_elements(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void missing_no(int[]arr){
        int sum_of_arr_elm=sum(arr);
        int no_sum=sum_n_elements(arr.length);
        System.out.println("MISSING NO IS "+ (no_sum-sum_of_arr_elm));
    }
    public static void reverse_arr(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap_no_arr(arr, i, j);
            i++;
            j--;
        }
    }
    public static void particular_rev_arr(int[]arr,int idx1,int idx2){
        int i=idx1;
        int j=idx2;
        if(idx1>idx2){
            System.out.println("invalid parameter");
            return;
        }
        while(i<j){
            swap_no_arr(arr, i,j);
            i++;
            j--;
        }
    }
    public static void unique_hash(int[]arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int value=1;
        boolean exist;
        for(int i=0;i<arr.length;i++){
            exist=mp.containsKey(arr[i]);
            if(exist==true){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],value);
            }
        }
        for(var ans:mp.keySet()){
           if(mp.get(ans)==1){
            System.out.println(" Unique element : "+ans);
            return;
           }
        }
    }
    public static void unique_loop(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=Integer.MIN_VALUE;
                    flag=false;
                }
            }
            if(flag==false){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=Integer.MIN_VALUE){
                System.out.println("UNIQUE ELEMENT: "+arr[i]);
                return;
            }
        }
    }
    public static boolean monotonic(int[]arr){
        boolean asc=false;
        boolean des=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                asc=true;
            }
            if(arr[i]>arr[i+1]){
                des=true;
            }
        }
        if(asc==true && des==true){
            return false;
        }
        return true;
    }
    public static void sort0_1_pointer(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
           if(arr[i]==0){
            i++;
           }
           if(arr[j]==1){
            j--;
           }
           if(arr[i]==1 && arr[j]==0){
            swap_no_arr(arr, i, j);
            i++;
            j--;
           }

        }
    }
    public static void sort0_1_count(int[]arr){
        int count0=0;
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
        
        }
        for(int i=0;i<arr.length;i++){
            if(i<count0){
                arr[i]=0;
            }
            else if(i<count0+count1){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
    }
    public static void bsort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap_no_arr(arr, j, j+1);
                }
            }

        }
    }
    public static void zero_end_relative(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]==0){
                    swap_no_arr(arr, j, j+1);
                }
            }       
        }
    }
    public static void next_greater_arr(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    arr[i]=arr[j];
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                arr[i]=-1;
            }
        }
    }
    public static void next_greater_stack(int[]arr){
        Stack<Integer>st=new Stack<>();
        st.push(arr[arr.length-1]);
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0){
                st.push(arr[i]);
                arr[i]=-1;
                continue;
            }
            if(arr[i]<st.peek()){
                arr[i]=st.peek();
            }
            st.push(arr[i]);
        }
    }
    public static void reverse_str(String abc){
        StringBuilder sb=new StringBuilder(abc);
        sb.reverse();
        System.out.println(sb);
    }
    public static void remove_arr_duplicate(int[]arr){
        ArrayList<Integer>hs=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=Integer.MIN_VALUE;
                }
            }
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
    public static void rem_cons_seq_arr(int[]arr){
        ArrayList<Integer> a1=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                if(arr[i]!=arr[i+1]){
                   a1.add(arr[i]);
                }
            }
            else if(i==arr.length-1){
                if(arr[i]!=arr[i-1]){
                    a1.add(arr[i]);
                }
            }
            else if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                a1.add(arr[i]);
            }
        }
        System.out.println(a1);
    }
    public static int[] rem_cons_seq_stack(int[]arr){
        Stack<Integer>st=new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(st.size()==0){
                st.push(arr[i]);
            }
            else if(arr[i]!=st.peek()){
                st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
                if(i==arr.length-1 || arr[i+1]!=st.peek()){
                    st.pop();
                }
            }
        }
        int n=st.size();
        int[]res=new int[n];
        for(int i=n-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void reverse_each_word(String abc){
        StringBuilder sb=new StringBuilder();
        String str="";
        for(int i=0;i<abc.length();i++){
            char ch=abc.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                str+=sb;
                sb=new StringBuilder();
            } 
        }
        sb.reverse();
        str+=sb;
        System.out.println(str);
    }
    public static void str_compress_total(String abc){
        StringBuffer sb1=new StringBuffer(abc);
        StringBuffer sb=new StringBuffer();
        int count=1;
        for(int i=0;i<sb1.length();i++){
            char ch=sb1.charAt(i);
            if(ch=='*'){
                continue;
            }
            for(int j=i+1;j<sb1.length();j++){
                if(ch==sb1.charAt(j)){
                    count++;
                    sb1.setCharAt(j, '*');

                }
            }
            sb.append(ch);
            if(count>1){
                sb.append(count);
            }
            count=1;
        }
        System.out.println(sb);
    }
    public static void str_compress_consecutive(String abc){
        int count=1;
        StringBuffer sb=new StringBuffer();
        sb.append(abc.charAt(0));
        for(int i=1;i<abc.length();i++){
            char ch=abc.charAt(i);
            if(ch==abc.charAt(i-1)){
                count++;
            }
            else{
                if(count>1){
                    sb.append(count);
                }
                sb.append(ch);
                count=1;
            }
        }
        if(count>1){
            sb.append(count);
        }
        System.out.println(sb);
    }
    




    public static void main(String[] args) {
        int[]arr={1,1,1,2,4,5,6,7,7,20,20,30};
        sigma5.disp_Array(arr);
        String abc="aaaaabbcdde";
        str_compress_total(abc);
        
        
        
    }
    
}
