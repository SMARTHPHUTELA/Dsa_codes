package repeat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;



public class master3 {
    public static void print_arr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int  sum_all_elements(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
       return sum;
    }

    public static int multiplication_all_elements(int[]arr){
        int ans=1;
        for (int i = 0; i < arr.length; i++) {
            ans=ans*arr[i];
        }
        return ans;
    }
    public static int maximum_element_with_idx(int[]arr){
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }
        System.out.println(maxidx);
        return max;
    }
    public static int minimum_element_with_idx(int[]arr){
        int min=Integer.MAX_VALUE;
        int minidx=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
                minidx=i;
            }
        }
        System.out.println(minidx);
        return min;
    }
    public static int max_inbuilt(int[]arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max, arr[i]);
        }
        return max;
    }
    public static int second_max_long(int[]arr){
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }
        arr[maxidx]=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2;
    }
    public static void prefix_sum_updating(int[]arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }
    public static int[] prefix_sum_newarr(int[]arr){
        int []pre=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=arr[i]+pre[i-1];
        }
        return pre;

    }
    public static void extreme_elements_print(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                break;
            }
            System.out.println(arr[i]);
            System.out.println(arr[j]);
            i++;
            j--;
        }
    }
    public static void swap_ele(int[]arr,int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
    public static void reverse_full_array(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap_ele(arr, i, j);
            i++;j--;
        }
    }
    public static void reverse_particular_part(int[]arr ,int low,int high){
        int i=low;
        int j=high;
        while(i<j){
            swap_ele(arr, i, j);
            i++;j--;
        }
    }
    public static int sum_n_ele(int n){
        int ans=0;
        for (int i = 1; i <=n; i++) {
            ans+=i;
        }
        return ans;
    }
    public static int missing_num_ber(int[]arr){
        int sum=sum_all_elements(arr);
        int summ_of_n_ele=sum_n_ele(arr.length);
        int missing_Element=summ_of_n_ele-sum;
        return missing_Element;
    }
    
    public static int unique_using_loop(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean checker=false;
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    checker=true;
                    arr[j]=Integer.MIN_VALUE;
                }
            }
            if(checker==true){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        for(int ans :arr){
            if(ans!=Integer.MIN_VALUE){
                return ans;
            }
        }
        return -1;
    }
    public static int unique_using_hashmap(int[]arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(mp.containsKey(arr[i])==true){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        for(var ans:mp.keySet()){
            if(mp.get(ans)==1){
                return ans;
            }
        }
        return -1;
    }
    public static boolean monotonic_define(int[]arr){
        int inc=1;
        int dec=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]){
                inc=0;
            }
            if(arr[i-1]<arr[i]){
                dec=0;
            }
        }
        if(inc==1 || dec==1){
            return true;
        }
        return false;
    }

    public static void zero_one__sort(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                swap_ele(arr, i, j);
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
    }
    public static void sort_012_count(int[]arr){
        int no0=0;
        int no1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                no0++;
            }
            else if(arr[i]==1){
                no1++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<no0){
                arr[i]=0;
            }
            else if(i<no0+no1){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
    }
    public static void bubbleSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap_ele(arr, j, j+1);
                }
            }
        }
    }
    public static void all_0_at_end(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0){
                    swap_ele(arr, j, j+1);
                }
            }
        }
    }
    public static void nxt_greater_ele(int[]arr){
        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=i+1;j<arr.length;j++){
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
    }
    public static int[] nxt_greater_elem(int[]arr){
        Stack<Integer> st=new Stack<>();
        int[]res=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0 && arr[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else if(arr[i]<=st.peek()){
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void reverse_string(String abc){
        StringBuilder sb=new StringBuilder(abc);
        sb.reverse();
        System.out.println(sb);
    }
    public static void reverse_string_particular(String abc,int idx1,int idx2){
        StringBuilder sb=new StringBuilder(abc);
        int i=idx1;
        int j=idx2;
        while(i<j){
            char ch=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }
        System.out.println(sb);

    }
    public static void remove_duplicates_in_array(int[]arr){
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=Integer.MIN_VALUE;
                }
            }
            ls.add(arr[i]);
        }
        System.out.println(ls);
    }
    public static void remove_repeated_elm(int[]arr){
        ArrayList<Integer> ls=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            int flag=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=Integer.MIN_VALUE;
                    flag=1;
                }
            }
            if(flag==1){
                arr[i]=Integer.MIN_VALUE;
            }
            else{
                ls.add(arr[i]);
            }
        }
        System.out.println(ls);
    }
    public static void remove_consecutive_elements(int[]arr){
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]){
                    ls.add(arr[i]);
                }
            }
            else if(i==arr.length-1){
                if(arr[i]!=arr[i-1]){
                    ls.add(arr[i]);
                }
            }
            else if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                ls.add(arr[i]);
            }
        }
        System.out.println(ls);
    }
    public static void remove_consecutive_elements_stack(int[]arr){
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(st.size()==0){
                st.push(arr[i]);
                continue;
            }
            if(arr[i]==st.peek()){
                if(i==arr.length-1 || arr[i+1]!=st.peek()){
                    st.pop();
                    continue;
                }
            }
            if(arr[i]!=st.peek()){
                st.push(arr[i]);
                continue;
            }
        }
        int[]ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        print_arr(ans);
    }

    public static void reverse_string_wordwise(String abc){
        abc+=" "; // if u get to dont use this base case u can add any space at end of given String
        String ans="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<abc.length();i++){
            char ch=abc.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb=new StringBuilder();
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
    public static void compress_string_total(String abc){
        StringBuffer sb=new StringBuffer(abc);
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='#'){
                continue;
            }
            int count=1;
            for(int j=i+1;j<sb.length();j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    sb.setCharAt(j, '#');
                    count++;
                }
            }
            sb1.append(sb.charAt(i));
            sb1.append(count);
        }
        System.out.println(sb1);
    }
    public static void compress_string_consecutive(String abc){
        abc+="@";
        int count =1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<abc.length()-1;i++){
            if(abc.charAt(i)==abc.charAt(i+1)){
                count++;
            }
            else{
                sb.append(abc.charAt(i));
                if(count>1){
                    sb.append(count);
                }
                count=1;
            }
        }
        System.out.println(sb);
    }
    public static void compress_string_consecutive_num_first(String abc){
        abc+="@";
        StringBuilder sb=new StringBuilder();
        int count =1;
        for(int i=0;i<abc.length()-1;i++){
            
            if(abc.charAt(i)==abc.charAt(i+1)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(abc.charAt(i));
                count=1;

            }
        }
        System.out.println(sb);
    }
    public static void com_str_old(String abc){
        StringBuffer sb=new StringBuffer();
        sb.append(abc.charAt(0));
        int count=1;
        for(int i=1;i<abc.length();i++){
          if(abc.charAt(i)==abc.charAt(i-1)){
            count++;
          }
          else{
            sb.append(count);
            sb.append(abc.charAt(i));
          }
        }
        sb.append(count);
        System.out.println(sb);
    }
    public static void compress_str_sliding2pointer(String s){
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else{
                sb.append(s.charAt(i));
                if(j-i>1){
                    sb.append(j-i);
                }
                i=j;
            }
        }
        sb.append(s.charAt(i));
        sb.append(j-i);
        System.out.println(sb);
    }
    public static void rotate_arr(int[]arr, int k){
        k=k%arr.length;
        reverse_particular_part(arr, 0, arr.length-k-1);
        reverse_particular_part(arr,arr.length-k, arr.length-1);
        reverse_full_array(arr);

    }
    public static void merge_sorted_arrays(int[]arr1,int[]arr2){
        int i=0;
        int j=0;
        int []ans=new  int[arr1.length+arr2.length];
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[k++]=arr1[i++];
        }
        while (j<arr2.length){
            ans[k++]=arr2[j++];   
        }
        print_arr(ans);

    }
    public static void print_matrix_row(int[][]arr1){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void print_matrix_col(int[][]arr1){
        for(int j=0;j<arr1[0].length;j++){
            for(int i=0;i<arr1.length;i++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void transpose_matrix(int[][]arr1){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
        }
    }

    public static void rotating_right_side(int[][]arr1){
        transpose_matrix(arr1);
        for(int i=0;i<arr1.length;i++){
            reverse_full_array(arr1[i]);
        }
        print_matrix_row(arr1);
    }
    public static void rotating_left_side(int[][]arr1){
        transpose_matrix(arr1);
        for(int j=0;j<arr1[0].length;j++){
            for(int i=0;i<arr1.length/2;i++){
                int temp=arr1[i][j];
                arr1[i][j]=arr1[arr1.length-i-1][j];
                arr1[arr1.length-i-1][j]=temp;
            }
        }
        
    }





    public static void main(String[] args) {
        int[]arr={1,2,4,5};
        int[][]arr1={{1,2,3},{4,5,6},{7,8,9}};
        // String abc="aaabbccdee";
       rotating_left_side(arr1);
       print_matrix_row(arr1);
        
        
       

        
        

    }


    
}
