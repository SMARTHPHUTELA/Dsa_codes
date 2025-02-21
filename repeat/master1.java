package repeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
public class master1 {
    public static void print_arr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    public static int sum1(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int multiply1(int[]arr){
        int ans=1;
        for(int i=0;i<arr.length;i++){
            ans*=arr[i];
        }
        return ans;
    }
    public static void max1(int[]arr){
        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }
        System.out.println("maximum number: "+max+"\n"+"max idx: "+maxidx);
    }
    public static int max2(int[]arr){
        int Max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            Max=Math.max(Max,arr[i]);
        }
        return Max;
    }
    public static void secondMAX(int[]arr){
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax){
                secmax=arr[i]; 
            }
        }
        System.out.println(max+" "+secmax);
    }
    public static void prefix_sum(int[]arr){
        //  int curr_sum=arr[0];
        //  for(int i=1;i<arr.length;i++){
        //     arr[i]+=curr_sum;
        //     curr_sum=arr[i];
        //  }
        int curr_sum=0;
        for (int i = 0; i < arr.length; i++) {
            // arr[i]+=curr_sum;
            // curr_sum=arr[i];
            curr_sum+=arr[i];
            arr[i]=curr_sum;
        }
    }
    public static void extremePRINT(int[]arr){
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
    public static void swap_elm(int[]arr,int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
    public static void rev_particular_arr(int []arr,int idx1,int idx2){
        int i=idx1;
        int j=idx2;
        while(i<j){
            swap_elm(arr, i, j);
            i++;
            j--;
        }
    }
    public static int sum_of_n_elements(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=i;
        }
        return ans;

    }
    public static void missing_number(int[]arr){
        int sum=sum1(arr);
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int sum_till=sum_of_n_elements(max);
        System.out.println("Misssing NUMBER: "+(sum_till-sum));
    }
    public static void hash_unique(int[]arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int value=1;
        for (int i = 0; i < arr.length; i++) {
            boolean exist=mp.containsKey(arr[i]);
            if(exist==true){
                mp.put(arr[i],mp.get(arr[i])+value);
            }
            else{
                mp.put(arr[i], value);
            }
        }
        for(var ans:mp.keySet()){
            if(mp.get(ans)==1){
                System.out.println("UNIQUE ELEMENT: "+ans);
            }
        }
    }
    public static void loop_unique(int[]arr){
        for(int i=0;i<arr.length;i++){
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
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=Integer.MIN_VALUE){
                System.out.println("UNIQUE ELEMENT: "+arr[i]);
            }
        }
    }
    public static void prove_monotonic(int[]arr){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                inc=false;
            }
            if(arr[i]<arr[i+1]){
                dec=false;
            }
        }
        if(inc==true || dec==true){
            System.out.println("its monotonic");
        }
        else{
            System.out.println("ITS not");
        }
    }
    public static void sort_pointer_0_1(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
            if(arr[i]==1 &&arr[j]==0){
                swap_elm(arr,i,j);
                i++;j--;
            }
        }
    }
    public static void sort_count_0_1_2(int []arr){
        int count0=0;
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
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
    public static void bubble_sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap_elm(arr, j, j+1);
                }
            }
        }
    }
    public static void relative_end_zero(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]==0){
                    swap_elm(arr, j, j+1);
                }
            }
        }
    }
    public static void next_greater_elm_arr(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int flag=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag=1;
                    arr[i]=arr[j];
                    break;
                }
            }
            if(flag==0){
                arr[i]=-1;
            }
        }
        arr[arr.length-1]=-1;
    }
    public static void next_greater_elm_stack(int[]arr){
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0 && arr[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0){
                st.push(arr[i]);
                arr[i]=-1;
                continue;
            }
            if(arr[i]<st.peek()){
                int x=arr[i];
                arr[i]=st.peek();
                st.push(x);
            }
            
        }
    }
    public static void prev_greater_elm_stack(int[]arr){
        Stack<Integer> st=new Stack<>();
        int[]res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(st.size()>0 && arr[i]>st.peek()){
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
        print_arr(res);
    }
    public static void Stock_span(int[]arr){
        int[]res=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        res[0]=1;
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=1;
            }
            else if(arr[i]<arr[st.peek()]){
                res[i]=i-st.peek();
            }
            st.push(i);
        }
        print_arr(res);

    }
    public static void rev_str(String abc){
        StringBuffer sb=new StringBuffer(abc);
        sb.reverse();
        System.out.println(sb);
    }
    public static void particular_rev_str(String abc,int idx1,int idx2){
        StringBuffer sb=new StringBuffer(abc);
        int i=idx1;
        int j=idx2;
        while (i<j) {
            char ch=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;            
        }
        System.out.println(sb);
    }
    public static void remove_duplicate_arr(int[]arr){
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[j]=Integer.MIN_VALUE;
                }
            }
            ls.add(arr[i]);
        }
        System.out.println(ls);
    }
    public static void remove_if_duplicate(int[]arr){
        ArrayList<Integer> ls=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            boolean flag=true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=Integer.MIN_VALUE;
                    flag =false;
                }
            }
            if(flag==true){
                ls.add(arr[i]);
            }
        }
        System.out.println(ls);
    }
    public static void remove_duplicate_str(String abc){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<abc.length();i++){
            char ch=abc.charAt(i);
            if(sb.indexOf(String.valueOf(ch))==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    public static void rem_consecutive_arr(int[]arr){
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
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
            else{
                if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                    a1.add(arr[i]);
                }
            }
        }
        System.out.println(a1);
    }
    public static void rem_consecutive_stack(int[]arr){
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
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
        while(st.size()>0){
            ls.add(st.pop());
        }
        System.out.println(ls);
    }
    public static void reverse_str_wordwise(String abc){
        StringBuilder sb=new StringBuilder();
        String ans="";
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
    public static void compress_str_total(String abc){
        int count=1;
        StringBuffer sb=new StringBuffer(abc);
        StringBuffer sb1=new StringBuffer();
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch=='*'){
                continue;
            }
            for(int j=i+1;j<sb.length();j++){
                if(ch==sb.charAt(j)){
                    count++;
                    sb.setCharAt(j, '*');
                }
            }
            sb1.append(ch);
            if(count>1){
                sb1.append(count);
            }
            count=1; 
        }
        System.out.println(sb1);
    }
    public static void compress_str_num_first(String abc){
        int count=1;
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<abc.length();i++){
            char ch=abc.charAt(i);
            if(ch==abc.charAt(i-1)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(abc.charAt(i-1));
                count=1;
            }
        }
        sb.append(count);
        sb.append(abc.charAt(abc.length()-1));
        System.out.println(sb);
    }
    public static void compress_str_hack(String abc){
        int count=1;
        String s=abc+"@";
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==s.charAt(i-1)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(s.charAt(i-1));
                count=1;
            }
        }
        System.out.println(sb);
    }
    public static void compress_str_consecutive(String abc){
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
    public static void rotate_arr(int[]arr,int k){
        k=k%arr.length;
        rev_particular_arr(arr, 0, arr.length-k-1);
        rev_particular_arr(arr, arr.length-k, arr.length-1);
        rev_particular_arr(arr, 0, arr.length-1);

    }
    public static void merge_sorted_arrays(int[]arr1,int[]arr2){
        int i=0;
        int j=0;
        int[] new_arr=new int[arr1.length+arr2.length];
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                new_arr[k++]=arr1[i++];
            }
            else{
                new_arr[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            new_arr[k++]=arr1[i++];
        }
        while(j<arr2.length){
            new_arr[k++]=arr2[j++];
        }
        print_arr(new_arr);
    }
    public static void matrix_row_print(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void matrix_col_print(int[][]arr){
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void transpose(int[][]arr){
        int[][]new_arr=new int[arr.length][arr[0].length];
        for (int i = 0; i < new_arr.length; i++) {
            for (int j = 0; j < new_arr[0].length; j++) {
                new_arr[i][j]=arr[j][i];
            }
        }
        matrix_row_print(new_arr);
    }
    public static void swap_matrix_elm(int[][]arr,int idx1,int idx2){
        int temp=arr[idx1][idx2];
        arr[idx1][idx2]=arr[idx2][idx1];
        arr[idx2][idx1]=temp;
        
    }
    public static void transpose_inplace(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                swap_matrix_elm(arr, i, j);
            }
        }
    }
    public static void rotate_right_matrix(int[][]arr){
       transpose_inplace(arr);
       for(int i=0;i<arr.length;i++){
        rev_particular_arr(arr[i],0,arr[0].length-1);
       } 
    }
    public static void swap_num(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void rotate_left_matrix(int[][]arr){
        transpose_inplace(arr);
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length/2;i++){
                int temp=arr[i][j];
                arr[i][j]=arr[arr.length-i-1][j];
                arr[arr.length-1-i][j]=temp;
            }
        }
    }
    public static void print_diagonal_matrix(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j  || i+j==arr[0].length-1){
                    System.out.print(arr[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void print_plus(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==arr.length/2 || j==arr[0].length/2){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void oppo_s_print(int[][]arr){
       for (int i = 0; i < arr.length; i++) {
        if(i%2==0){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        else{
            for (int j = arr[0].length-1; j >=0; j--) {
                System.out.print(arr[i][j]+" ");
            }
        }
        
       } 
    }
    public static void spiral_matrix_print(int[][]arr){
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        while(minr<maxr || minc<maxc){
            for(int j=0;j<=maxc;j++){
                System.out.print(arr[minr][j]+" ");
            }
            minr++;
            if(minr>maxr || minc>maxc){
                break;
            }
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;
            if(minr>maxr || minc>maxc){
                break;
            }
            for(int j=maxc;j>=minc;j--){
                System.out.print(arr[maxr][j]+" ");
            }
            maxr--;
            if(minr>maxr || minc>maxc){
                break;
            }
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
        }

    }
    public static void print_dud_matrix(int[][]arr){
        for(int j=0;j<arr[0].length;j++){
            if(j%2!=0){
                for(int i=0;i<arr.length/2;i++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[arr.length-i-1][j];
                    arr[arr.length-i-1][j]=temp;
                }
            }
        }
        matrix_col_print(arr);
    }
    public static void max_row_sum(int[][]arr){
        int maximum=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            maximum=Math.max(maximum,sum);
        }
        System.out.println(maximum);
    }
    public static void score_matrix(int[][]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]==0){
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }
        }
        for(int j=1;j<arr[0].length;j++){
            int no0=0;
            int no1=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i][j]==0){
                    no0++;
                }
                else{
                    no1++;
                }
            }
            if(no0>no1){
                for(int i=0;j<arr.length;j++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }
        }
        int multiplier=1;
        int score=0;
        for(int j=arr[0].length-1;j>=0;j--){
            for(int i=0;i<arr.length;i++){
                score+=arr[i][j]*multiplier;
            }
            multiplier*=2;
        }
        System.out.println(score);
    }
    public static void pascal_triangal(int n){ // n= row
        ArrayList<ArrayList<Integer>> a1=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> ls=new ArrayList<>();
            for(int j=0;j<=i;j++){
                ls.add(1);
            }
            a1.add(ls);
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
                a1.get(i).set(j,a1.get(i-1).get(j)+a1.get(i-1).get(j-1));
            }
        }
        System.out.println(a1);
    }
    public static void print_subarrays(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    
    }
    public static void set_zero_matrix(int[][]arr){
        int[][]helper=new int[arr.length][arr[0].length];
        for (int i = 0; i < helper.length; i++) {
            for (int j = 0; j < helper[0].length; j++) {
                helper[i][j]=arr[i][j];
            }
        }
        for (int i = 0; i < helper.length; i++) {
            for (int j = 0; j < helper[0].length; j++) {
                if(helper[i][j]==0){
                    for(int k=0;k<arr[0].length;k++){
                        arr[i][k]=0;
                    }
                    for(int k=0;k<arr.length;k++){
                        arr[k][j]=0;
                    }
                }
            }
        }
    }
    public static void set_zero_matrix1(int[][]arr){
        boolean[]row=new boolean[arr.length];
        boolean[]col=new boolean[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(row[i]==true){
                for(int j=0;j<arr[0].length;j++){
                    arr[i][j]=0;
                }
            }
        }
        for(int j=0;j<arr[0].length;j++){
            if(col[j]==true){
                for(int i=0;i<arr.length;i++){
                    arr[i][j]=0;
                }
            }
        }
    }
    public static boolean valid_word(String word){
        int countC=0;
        int countV=0;
        int countNum=0;
        if(word.length()<3){
            return false;
        }
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if((ch>='a'&& ch<='z') || (ch>='A'&&ch<='Z')){
                ch=Character.toLowerCase(ch);
                if(ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u'){
                    countV++;
                }
                else if(ch>='a' && ch<='z'){
                    countC++;
                }
            }
            else if(ch>='0' && ch<='9'){
                countNum++;
            }
            else{
                return false;
            }
        }
        if(countC>=1 &&countV>=1 && countNum>=1){
            return true;
        }
        return false;
    }
    public static boolean valid_parenthesis(String s){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='{'){
                st.push(ch);
                continue;
            }
            if(ch=='('){
                st.push(ch);
                continue;
            }
            if(ch=='['){
                st.push(ch);
                continue;
            }
            if(ch==')'){
                if(st.size()==0){
                    return false;
                }
                if(st.peek()!='('){
                    return false;
                }
                st.pop();
            }
            if(ch==']'){
                if(st.size()==0){
                    return false;
                }
                if(st.peek()!='['){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            if(ch=='}'){
                if(st.size()==0){
                    return false;
                }
                if(st.peek()!='{'){
                    return false;
                }
                st.pop();
            }
        }
        if(st.size()==0){
            return true;
        }
        return false;
    }
    public static void convert_lc_uc(String abc){
        StringBuffer sb=new StringBuffer(abc);
        for(int i=0;i<abc.length();i++){
            char ch=abc.charAt(i);
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
    public static void all_substring(String abc){
        for(int i=0;i<abc.length();i++){
            for (int j = i+1; j <=abc.length(); j++) {
                System.out.print(abc.substring(i, j)+" ");
            }
        }
    }
    public static boolean check_palindrome(String abc){
        int i=0;
        int j=abc.length()-1;
        while (i<j) {
            if(abc.charAt(i)==abc.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void palidromic_substring(String abc){
        for (int i = 0; i < abc.length(); i++) {
            for (int j = i+1; j <= abc.length(); j++) {
                if(check_palindrome(abc.substring(i, j))==true){
                    System.out.print(abc.substring(i,j)+" ");
                }
                
            }
        }
    }
    public static boolean check_anagram(String abc,String xyz){
        if(abc.length() !=xyz.length()){
            return false;
        }
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<abc.length();i++){
            char ch=abc.charAt(i);
            boolean exist=mp.containsKey(ch);
            if(exist==true){
                mp.put(ch, mp.get(ch)+1);
            }
            else{
                mp.put(ch, 1);
            }
        }
        for(int i=0;i<xyz.length();i++){
            char dh=xyz.charAt(i);
            if(mp.containsKey(dh)==true){
                mp.put(dh, mp.get(dh)-1);
            }
            else{
                return false;
            }
        }
        for(var ans:mp.keySet()){
            if(mp.get(ans)!=0){
                return false;
            }
        }
        return true;
    }
    public static HashMap<Character,Integer> frequency_hashmap(String abc){
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<abc.length();i++){
            char ch=abc.charAt(i);
            if(mp.containsKey(ch)==true){
                mp.put(ch, mp.get(ch)+1);
            }
            else{
                mp.put(ch,1);
            }
        }
        return mp;
    }
    public static boolean check_isomorphic(String abc,String xyz){
        HashMap<Character,Character> mp =new HashMap<>();
        if(abc.length()!=xyz.length()){
            return false;
        }
        for (int i = 0; i < abc.length(); i++) {
            char ch=abc.charAt(i);
            char dh=xyz.charAt(i);
            if(mp.containsKey(ch)==true){
                if(mp.get(ch)!=dh){
                    return false;
                }
            }
            else{
                if(mp.containsValue(dh)){
                    return false;
                }
                mp.put(ch, dh);
            }
        }
        return true;
    }
    public static String max_str(String s,String t){
        if(s.compareTo(t)>0){
            return s;
        }
        else{
            return t;
        }
    }
    public static void sentence_lexo_maximum(String abc){
        int spaces=0;
        for(int i=0;i<abc.length();i++){
            char ch=abc.charAt(i);
            if(ch==' '){
                spaces++;
            }
        }
        String[]arr=new String[spaces+1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder();
            while(j<abc.length()){
                if(abc.charAt(j)!=' '){
                    sb.append(abc.charAt(j));
                    j++;
                }
                else{
                    j++;
                    break;
                }
            }
            arr[i]=sb.toString();
        }
        String MaximumString="";
        for(int i=0;i<arr.length;i++){
            MaximumString=max_str(MaximumString, arr[i]);
        }
        System.out.println(MaximumString);
        
    }
    public static void sort_str_array(String[]arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[min])<0){
                    String temp=arr[j];
                    arr[j]=arr[min];
                    arr[min]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }   
    public static void max_consecutive_ones(int[]arr){
        int max=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
        }
        max=Math.max(max,count);
        System.out.println(max);
    }
    public static boolean palindrome_number(int n){
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean num_palindrome_appr2(int n){
        if(n<0){
            return false;
        }
        String abc="";
        while(n>0){
            int l_digit=n%10;
            abc=abc+l_digit;
            n=n/10;
        }
        Integer x=Integer.valueOf(abc);
        if(x==Integer.valueOf(n)){
            return true;
        }
        return false;
    }
    public static void binaryS(int[]arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("NOT found");
    }
    public static void binaryS_particular_arr(int[]arr,int idx1,int idx2,int target){
        int low=idx1;
        int high=idx2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("NOT FOUND !");
    }
    public static void fo_bs(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        int idx=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                idx=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        System.out.println(idx);
    }
    public static void lo_bs(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        int idx=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                idx=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(idx);
    }
    public static int lower_bound(int[]arr,int  target){
        int low=0;
        int high=arr.length-1;
        int idx=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                idx=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
        }
        return idx;
    }
    public static int upper_bound(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        int idx=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                idx=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return idx;
    }
    public static int peak_element(int[]arr){
        int low=1;
        int high=arr.length-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static int sqrt_bs(int x){
        int low=0;
        int high=x;
        int ans=-1;
        while(low<=high){
           int mid=(low+high)/2;
           if(mid*mid==x){
            ans=mid;
            return ans;
           }
           else if(mid*mid>x){
            high=mid-1;
           }
           else{
            low=mid+1;
           }
        }
        return high;

    }
    public static void search_in_rotated_bs(int[]arr,int target){ //not efficient
        rotate_arr(arr, 1);
        int pivot=peak_element(arr);
        if(pivot!=-1){   //if array is not rotated
            int low=0;
            int high=pivot;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==target){
                    System.out.println(mid);
                    return;
                }
                else if(arr[mid]>target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            low=pivot+1;
            high=arr.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==target){
                    System.out.println(mid);
                    return;
                }
                else if(arr[mid]>target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            System.out.println("not found");
        }
        else{
            binaryS(arr, target);
        }
    }
    public static int search2_in_rotate_bs(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<=arr[high]){   //  mid to high  is SORTED
                if(target>arr[mid] && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else if(arr[mid]>arr[high]){     // low to mid is SORTED
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
    public static ArrayList<Integer> k_closest(int[]arr,int key,int num){
        ArrayList<Integer> a1=new ArrayList<>();
        int closest=lower_bound(arr, key);
        if(closest==0){
            for(int i=0;i<num;i++){
                a1.add(arr[i]);
            }
            return a1;
        }
        
        if(closest==arr.length-1 || closest==arr.length){
            for(int i=arr.length-num;i<arr.length;i++){
                a1.add(arr[i]);
            }
            return a1;
        }
        int i=closest;
        int j=i+1;
        while(a1.size()<num && i>=0 && j<arr.length){
            if(Math.abs(key-arr[i])<=Math.abs(key-arr[j])){
                a1.add(arr[i]);
                i--;
            }
            else{
                a1.add(arr[j]);
                j++;
            }
        }
        while(j==arr.length && a1.size()<num){
            a1.add(arr[i]);
            i--;
        }
        while(i==-1 && a1.size()<num){
            a1.add(arr[j]);
            j++;
        }
        return a1;
    }
    public static boolean isLessThanThresh(int[]arr,int mid,int threshold){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%mid==0){
                sum+=arr[i]/mid;
            }
            else{
                sum+=arr[mid]/mid+1;
            }
        }
        if(sum<=threshold){
            return true;
        }
        return false;
    }
    public static void smallest_divisor(int[]arr,int threshold){
        int low=0;
        int high=max2(arr);
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isLessThanThresh(arr, mid, threshold)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isPossible_wt(int[]weight,int mid,int days){
        int d=1;
        int load=0;
        for (int i = 0; i < weight.length; i++) {
            if(load+weight[i]<=mid){
                load+=weight[i];
            }
            else{
                load=weight[i];
                d++;
            }
        } 
        if(d<=days){
            return true;
        }
        return false;
    }
    public static void min_weight(int[]weight,int days){
        int low=max2(weight);
        int high=sum1(weight);
        int min_wt=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible_wt(weight, mid, days)==true){
                min_wt=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(min_wt);
    }
    public static boolean isPossible_product(int mid,int[]quantity,int stores){
        int no_stores=0;
        for (int i = 0; i < quantity.length; i++) {
            if(quantity[i]%mid==0){
                no_stores+=quantity[i]%mid;
            }
            else{
                no_stores+=quantity[i]%mid+1;
            }
        }
        if(no_stores<=stores){
            return true;
        }
        return false;
    }
    public static void min_product(int[]quantity,int stores){
        int low=1;
        int high=max2(quantity);
        int ans=0;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(isPossible_product(mid,quantity,stores)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static int  k_missing(int[]arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missed=arr[mid]-(mid+1);
            if(missed<=k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return k+(high+1);
    }
    public static void display_ll(node head){
        node temp=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void display_ll_recursive(node head){
        if(head==null){
            return;
        }
        System.out.println(head.data);
        display_ll_recursive(head.next);
    }
    // middle node (both odd and even cases)
    public static int  middNode(node head){
        node slow=head;
        node fast=head;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
    //  nth node from end in ll
    public static node nth_node_from_end(node head,int n){
        node slow=head;
        node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){ // it means we are talking about first node only
            head=head.next;
        }
        while (fast!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    // delete node when head is not given (no data of head is provided)
    public static void delete_node_without_head(node Node){
        Node.data=Node.next.data;
        Node.next=Node.next.next;
    }
    // swapping node value with nth from start and nth from end
    public static void swapping_value_ll(node head,int n){
        node temp=head;
        node nth_fromEnd=nth_node_from_end(head, n);
        for(int i=1;i<=n-1;i++){
            temp=temp.next;
        }
        int val=temp.data;
        temp.data=nth_fromEnd.data;
        nth_fromEnd.data=val;
    }
    public static boolean has_cycle(node head){
        node slow=head;
        node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static node detect_Cycle(node head){
        if(head==null ||head.next==null){
            return null;
        }
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
        }
        if(fast!=slow){
            return null;
        }
        node temp=head;
        while(slow!=fast){
            slow=slow.next;
            temp=temp.next;
        }
        return temp;
    }
    public static node deleteduplicate_ll_sp(node head){
        node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
    public static node deleteduplicate_ll_rg(node head){//2 pointer in ll(aage piche)
        if(head==null){
            return null;
        }
        node a=head;
        node b=head;
        while(b!=null){
            if(a.data==b.data){
                b=b.next;
            }
            else{
                a.next=b;
                a=b;
            }
        }
        a.next=b;
        return head;
    }
    public static void infix_evalution(String s){
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int asci=(int)ch;
            if(asci>=48 && asci<=57){
                val.push(asci-48);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1+v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();   // removing open bracket;
            }
            else{
                if(ch=='+'|| ch=='-'){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1+v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*'|| ch=='/'){
                    if(op.peek()=='*'|| op.peek()=='/'){
                        int v2=val.pop();
                        int v1=val.pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        while(val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
            if(op.peek()=='-'){
                val.push(v1-v2);
            }
            if(op.peek()=='+'){
                val.push(v1+v2);
            }
            if(op.peek()=='*'){
                val.push(v1*v2);
            }
            if(op.peek()=='/'){
                val.push(v1/v2);
            }
            op.pop();
        }
        System.out.println(val.peek());
        
    }
    public static void reorder_queue(){
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int n=q.size();
        for(int i=1;i<=(n/2);i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=1;i<=(n/2);i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
    public static int  fac_rec(int n){
        if(n==0 ){
            return 1;
        }
        int ans=fac_rec(n-1);
        return ans*n;
    }
    public static int fibbonacci_rec(int n){ // n==nth term
        if(n==0 ||n==1){
            return n;
        }
        int prev=fibbonacci_rec(n-1);
        int prevprev=fibbonacci_rec(n-2);
        return prev+prevprev;
    }
    public static int sum_of_digits_rec(int n){
        if(n<0){
            System.out.println("in_valid");
            return -1;
        }
        if(n>=0 && n<=9){
            return n;
        }
        int sum_of_previous_digits=sum_of_digits_rec(n/10);
        int ans=n%10+sum_of_previous_digits;
        return ans;
    }
    public static int count_no_digits_rec(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        int count_previous_digit=count_no_digits_rec(n/10);
        return count_previous_digit+1;
    }
    public static int p_power_q_rec(int p,int q){
        if(q==0){
            return 1;
        }
        // if(q==1){
        //     return p;
        // }
        int recursive_work=p_power_q_rec(p, q-1);
        return p*recursive_work;
    }
    public static void print_k_multiple_rec(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        System.out.println(n*k);
        print_k_multiple_rec(n, k-1);
        // System.out.println(n*k);
    }
    public static void igcd(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        System.out.println(y);
    }
    public static int multi_rec(int x,int y){
        if(y==0 || x==0){
            return 0;
        }
        int previous=multi_rec(x-1, y);
        return previous+y;
    }
    public static int rgcd(int x,int y){
        if(y==0){
            return x;
        }
        return rgcd(y,x%y);
    }
    public static void lcm(int x,int y){
        int gcd=rgcd(x,y);
        System.out.println((x*y)/gcd);
    }
    public static void arr_trav_rec(int []arr,int idx){
        if(idx==arr.length-1){
            System.out.print(arr[idx]+" ");
            return;
        }
        arr_trav_rec(arr, idx+1);
        System.out.print(arr[idx]+" ");
        // arr_trav_rec(arr, idx+1);
        
    }
    public static int  arr_max_rec(int[]arr,int idx1,int idx2){
        if(idx1==idx2){
            return arr[idx1];
        }
        int smallans=arr_max_rec(arr, idx1+1, idx2);
        int final_ans=Math.max(arr[idx1],smallans);
        return final_ans;
    }
    public static boolean search_bool_arr(int[]arr,int target,int idx){
        if(idx>=arr.length){
            return false;
        }
        if(search_bool_arr(arr, target, idx+1)==true){
            return true;
        }
        if(arr[idx]==target){
            return true;
        }
        else{
            return false;
        }
    }
    public static int  search_arr(int[]arr,int target,int idx){
        if(idx>=arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return search_arr(arr, target, idx+1);
    }
    public static void zigzag(int n){
        if(n==0){   
            return;
        }
        System.out.print(n);
        zigzag(n-1);
        System.out.print(n);
        zigzag(n-1);
        System.out.print(n);
    }
    public static void rem_occ_rec(String s,int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(i);
        if(ch!='a'){
            rem_occ_rec(s, i+1, ans+ch);
        }
        else{
            rem_occ_rec(s, i+1, ans);
        }
    }
    public static ArrayList<String> print_subset(String s,int i){
        ArrayList<String> ans=new ArrayList<>();
         if(i==s.length()){
            ans.add(" ");
            return ans;
         }
        ArrayList<String> smallAns=print_subset(s, i+1);
        char ch=s.charAt(i);
        for(var el:smallAns){
            ans.add(el);
            ans.add(ch+el);
        }
        return ans;

    }


    public static void main(String[] args) {
        int[]arr={1,3};
        // node a =new node(10);
        // node b =new node(20);
        // node c =new node(30);
        // node d =new node(40);
        // a.next=b;
        // b.next=c;
        // c.next=d;
        // System.out.println(lower_bound(arr, 2));
        // System.out.println(k_closest(arr, 2, 1));
        // String abc="A dog is fool";
        compress_str_total("aababcdcde");
        
        
       

       
    }
}
