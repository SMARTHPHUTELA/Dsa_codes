package repeat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class master4 {
    public static void arr_print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int sum_all_elm_arr(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int mul_all_elems(int[]arr){
        int ans=1;
        for(int i=0;i<arr.length;i++){
            ans*=arr[i];
        }
        return ans;
    }
    public static int maxElm1(int[]arr){
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }
        return maxidx;
    }
    public static int maxElm2(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }
    public static int secMax1(int[]arr){
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }
        arr[maxidx]=Integer.MIN_VALUE;
        return maxElm2(arr);
    }
    public static int secMaxBest(int[]arr){
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];

            }
            else if(arr[i]>secmax){
                secmax=arr[i];
            }
        }
        return secmax;
    }
    public static void print_extreme(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(i==j){
                System.out.print(arr[i]+" ");
                break;
            }
            System.out.print(arr[i]+" ");
            i++;
            System.out.print(arr[j]+" ");
            j--;
        }
    }
    public static void elmSwap(int[]arr,int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
    public static void rev_arr(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            elmSwap(arr, i, j);
            i++;j--;
        }
        
    }
    public static void rev_arr_particular(int []arr,int idx1,int idx2){
        int i=idx1;
        int j=idx2;
        while(i<j){
            elmSwap(arr, i, j);
            i++;
            j--;
        }
    }
    public static int sum_n_elems(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void unique_elm(int[]arr){
        for(int i=0;i<arr.length;i++){
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
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=Integer.MIN_VALUE){
                System.out.println(arr[i]);
            }
        }
    }
    public static void monotonic(int[]arr){
        boolean asc=true;
        boolean desc=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                asc=false;
            }
            if(arr[i]<arr[i+1]){
                desc=false;
            }
        }
        if(asc || desc){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void sort_0_1_pointers(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                elmSwap(arr, i, j);
                i++;j--;
            }
            else if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
        }
    }
    public static void sort_012_count(int[]arr){
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
    public static void bubbleSORT(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    elmSwap(arr, j, j+1);
                }
            }
        }
    }
    public static void zeros_at_end(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0){
                    elmSwap(arr, j, j+1);
                }
            }
        }
    }
    public static void hashmap_unique(int []arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])==true){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        for(var ans:mp.keySet()){
            if(mp.get(ans)==1){
                System.out.println(ans);
            }
        }
    }
    public static void next_greater_element_arr(int[]arr){
        for(int i=0;i<arr.length-1;i++){
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
        arr[arr.length-1]=-1;
    }
    public static int[] next_greater_element_stack(int []arr){
        Stack<Integer> st=new Stack<>();
        int[]res=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else if(arr[i]<st.peek()){
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void reverse_string(String abc){
        StringBuffer sb=new StringBuffer(abc);
        sb.reverse();
        System.out.println(sb);
    }
    public static void remove_duplicates_array(int[]arr){

    }

    public static void reverse_str_particular(String abc ,int idx1,int idx2){
        StringBuffer sb=new StringBuffer(abc);
        int i=idx1;
        int j=idx2;
        while(i<j){
            char ch =sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }
        System.out.println(sb);
    }
    public static void remove_dup_arr(int[]arr){
        ArrayList<Integer> lt=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=Integer.MIN_VALUE;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=Integer.MIN_VALUE){
                lt.add(arr[i]);
            }
        }
        System.out.println(lt);
    }
    public static void remove_dup_str(String abc){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<abc.length();i++){
            
                char ch=abc.charAt(i);
                if(sb.indexOf(String.valueOf(ch))==-1){
                    sb.append(ch);
                }
            
        }
        System.out.println(sb);
    }
    public static void remove_consecutive_arr(int[]arr){
        ArrayList<Integer> lt=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]){
                    lt.add(arr[i]);
                }
            }
            else if(i==arr.length-1){
                if(arr[i]!=arr[i-1]){
                    lt.add(arr[i]);
                }
            }
            else if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                lt.add(arr[i]);
            }

        }
        System.out.println(lt);
    }
    public static void remove_consecutive_stack(int[]arr){
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> lt=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0){
                st.push(arr[i]);
                continue;
            }
            if(arr[i]==st.peek()){
                if(i==arr.length-1 || arr[i+1]!=arr[i]){
                    st.pop();
                    continue;
                }
            }
            if(arr[i]!=st.peek()){
                st.push(arr[i]);
                continue;
            }
        }
        while(st.size()>0){
            lt.add(st.pop());
        }
        System.out.println(lt);

    }
    public static void reverse_string_wordwise(String str){
        String ans="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                sb.append(str.charAt(i));
            }
            else{
                sb.reverse();
                ans=ans+sb;
                ans+=" ";
                sb=new StringBuilder();
            }
        }
        ans+=sb.reverse();
        System.out.println(ans);
    }
    public static void compress_string_whole(String abc){
        StringBuffer sb=new StringBuffer(abc);
        StringBuffer sb1=new StringBuffer();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='*'){
                continue;
            }
            int count=1;
            for(int j=i+1;j<sb.length();j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    count++;
                    sb.setCharAt(j, '*');
                }
            }
            sb1.append(sb.charAt(i));
            if(count>1){
                sb1.append(count);
            }
        }
        System.out.println(sb1);
    }
    public static void compress_str_number_first(String abc){
        StringBuilder sb=new StringBuilder(abc);
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='*'){
                continue;
            }
            int count=1;
            for(int j=i+1;j<sb.length();j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    count++;
                    sb.setCharAt(j, '*');
                }
            }
            if(count>1){
                sb1.append(count);
            }
            sb1.append(sb.charAt(i));
        }
        System.out.println(sb1);
    }
    public static void comp_str_cons(String abc){
        abc+="#";
        StringBuffer sb=new StringBuffer();
        int count=1;
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
    public static void merge_sorted_arrays(int[]arr1,int[]arr2){
        int i=0;
        int j=0;
        int[]arr=new int[arr1.length+arr2.length];
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[k++]=arr1[i++];
            }
            else{
                arr[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            arr[k++]=arr1[i++];
        }
        while(j<arr2.length){
            arr[k++]=arr2[j++];
        }
        arr_print(arr);
    }
    public static void rotateArr(int[]arr,int k){
        k=k%arr.length;
        rev_arr_particular(arr,0 , arr.length-k-1);
        rev_arr_particular(arr,arr.length-k , arr.length-1);
        rev_arr(arr);
    }
    public static void s_print(int[][]arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");

                }
            }
        }
    }
    public static void hollow_rec(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void print_diagonal_matrix(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j || i+j==arr[0].length-1){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void down_up_down(int[][]arr){
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            
            
        }
    }
    public static void maximum_row_sum(int[][]arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            max=Math.max(max, sum);
        }
        System.out.println(max);
    }
    public static boolean check_isomorphic(String a,String b){
        HashMap<Character,Character> mp=new HashMap<>();
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(mp.containsKey(a.charAt(i))==false){
                mp.put(a.charAt(i), b.charAt(i));
            }
            else{
                if(mp.get(a.charAt(i))!=b.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void max_consecutive_ones(int[]arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                max=Math.max(max, count);
                count=0;
            }
            
        }
        System.out.println(count);
    }
    public static int reverse_no(int n){
        int ans=0;
        while(n>0){
            ans=ans*10+n%10;
            n=n/10;
        }
        return ans;
    }
    public static boolean palindrome_number(int n){
        int reverse=reverse_no(n);
        if(n==reverse){
            return true;
        }
        return false;

    }
    public static int binary_search(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
        }
        return -1;
    }
    public static int binary_search_particular(int []arr,int target ,int idx1,int idx2){
        int low=idx1;
        int high=idx2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int first_occ(int []arr,int target){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int last_occ(int []arr,int target){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int lower_bound(int[]arr,int target){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
    public static int upper_bound(int[]arr,int target){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int peak_element(int[]arr){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            
            int low=1;
            int high=arr.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    ans=mid;
                }
                else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return arr[ans];
       
    }



    public static void main(String[] args) {
        int[]arr1={1,7,9,10};
        int[]arr2={1,2,3,3,8,8,8,8,10,9,7,4};
        int[][]arrmat={{1,2,3},{4,5,6},{7,8,9}};
        master1.print_subarrays(arr1);
        
        

        
        
        
        

        
        

        

        
       
    }
    

    
}
