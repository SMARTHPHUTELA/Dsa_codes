package repeat;

import java.util.ArrayList;
import java.util.Stack;

public class master2 {
    public static void print_arr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int max_idx(int[]arr){
        int max=Integer.MIN_VALUE;
        int maxidx=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }
        return maxidx;
    }
    public static int second_large(int[]arr){
        int first=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i]){
                sec=first;
                first=arr[i];
            }
            else if(arr[i]>sec){
                sec=arr[i];
            }
        }
        return sec; 
    }
    public static void prefix_sum(int[]arr){
        // MAKING CHANGES IN OLD ARRAY 
        // for(int i=1;i<arr.length;i++){
        //     arr[i]+=arr[i-1];
        // }
        // print_arr(arr);

        //MAKING A NEW PREFIX SUM ARRAY
        int[]pre=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<pre.length;i++){
            pre[i]=arr[i]+pre[i-1];
        }
        print_arr(pre);
    }
    public static void suffix_sum(int[]arr){
        int []suff=new int[arr.length];
        suff[suff.length-1]=arr[arr.length-1];
        for(int i=suff.length-2;i>=0;i--){
            suff[i]=arr[i]+suff[i+1];
        }
        print_arr(suff);
    }
    public static void sushant_print(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(i==j){
                System.out.print(arr[i]+" ");
                break;
            }
            System.out.print(arr[i]+" ");
            System.out.print(arr[j]+" ");
            i++;
            j--;
        }
    }
    public static void rev_arr_particular(int[]arr,int idx1,int idx2){
        int i=idx1;
        int j=idx2;
        while(i<j){
            master1.swap_elm(arr, i, j);
            i++;
            j--;
        }
    }
    public static boolean monotonic(int []arr){
        boolean inc=true;
        boolean dec=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                inc=false;
            }
            if(arr[i]<arr[i+1]){
                dec=false;
            }
        }
        if(inc || dec){
            return true;
        }
        return false;
    }
    public static void next_greater_element_arr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int flag=0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    arr[i]=arr[j];
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                arr[i]=-1;
            }
        }
        arr[arr.length-1]=-1;
    }
    public static void next_greater_element_stack(int []arr){
        int[]res=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0 && arr[i]<st.peek()){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        print_arr(res);
    }
    public static void rem_duplicate_arr(int[]arr){
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[j]=Integer.MIN_VALUE;
                }
            }
            ans.add(arr[i]);

        }
        System.out.println(ans);
    }
    public static void rem_if_exist(int[]arr){
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int flag=0;
            if(arr[i]==Integer.MIN_VALUE) continue;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                   arr[j]=Integer.MIN_VALUE;
                    flag=1;
                }
            }
            if(flag==0){
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
    }
    public static void rem_consecutive_stack(int[]arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0){
                st.push(arr[i]);
                continue;
            }
            if(arr[i]==st.peek()){
                if(i==arr.length-1 || arr[i+1]!=st.peek()){
                    st.pop();
                }
            }
            else{
                st.push(arr[i]);
            }
        }
        int[]ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        print_arr(ans);
    }
    public static String max_str(String a,String b){
        if(a.compareTo(b)>=0){
            return a;
        }
        return b;
    }
    public static String sentence_lexo_maximum(String s){
        int spaces=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                spaces++;
            }
        }
        int no_words=spaces+1;
        String[]arr=new String[no_words];
        int j=0;
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder();
            while(j<s.length()){
                if(s.charAt(j)!=' '){
                    sb.append(s.charAt(j));
                    j++;
                }
                else{
                    j++;
                    break;
                }
            }
            arr[i]=sb.toString();
        }
        String maximum="";
        for (int k = 0; k < arr.length; k++) {
            if(arr[k].compareTo(maximum)>0){
                maximum=arr[k];
            }
        }
        return maximum;
    }
    public static void string_swap(String[]arr,int idx1,int idx2){
        String temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
    public static void str_sort(String[]arr){
        for(int i=0;i<arr.length;i++){
            int maxidx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[maxidx])<0){
                    maxidx=j;
                }
            }
            string_swap(arr, maxidx, i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int sqrt_bs(int n){
        int low=0;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high;
    }
    public static int search_in_rotatedbs(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<=arr[high]){
                if(target>arr[mid]&& target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else if(arr[mid]>arr[high]){
                if(target>=arr[low] && target<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            } 
        }
        return -1;
    }
    public static int lower_b(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        int lb=arr.length;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]>=target){
                lb=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return lb;
    }
    public static void compress_string(String abc){
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<abc.length();i++){
            if(abc.charAt(i)==abc.charAt(i-1)){
                count++;
            }
            else{
                sb.append(abc.charAt(i-1));
                sb.append(count);
                count=1;
            }
        }
        sb.append(abc.charAt(abc.length()-1));
        sb.append(count);
        System.out.println(sb);
    }
    public static void convert_lower_upper(String abc){
        StringBuilder sb=new StringBuilder(abc);
        for (int i = 0; i < sb.length(); i++) {
            char ch=sb.charAt(i);
            if(ch==' '){
                continue;
            }
            int asci=(int)ch;
            if(asci>=97){
                asci-=32;
                char dh=(char)asci;
                sb.setCharAt(i, dh);
            }
            else{
                asci+=32;
                char dh=(char)asci;
                sb.setCharAt(i, dh);
            }
        }
        System.out.println(sb);
    }




    public static void main(String[] args) {
        // int[]arr={1,2,3,4};
        String s="aaabc cDd";
        convert_lower_upper(s);
    }
}
