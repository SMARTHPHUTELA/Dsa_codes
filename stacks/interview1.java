package stacks;

import java.util.Stack;
//              LEETCODE 20
public class interview1 {
    public static boolean isValid(String abc){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<abc.length();i++){
            char ch=abc.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            if(ch=='{'){
                st.push(ch);
            }
            if(ch=='['){
                st.push(ch);
            }
            if(ch==')'){
                if(st.size()==0 ){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                    continue;
                }
                if(ch!=st.peek()){
                    return false;
                }
               
                
            }
            if(ch=='}'){
                if(st.size()==0 ){
                    return false;
                }
                if(st.peek()=='{'){
                    st.pop();
                    continue;
                }
                
                if(ch!=st.peek()){
                    return false;
                }
                
            }
            if(ch==']'){
                if(st.size()==0 ){
                    return false;
                }
                if(st.peek()=='['){
                    st.pop();
                    continue;
                }
                if(ch!=st.peek()){
                    return false;
                } 
            }
            
            
            
        }
        if(st.size()==0){
            // System.out.println("BALANCED");
            return true;
        }
        else{
            // System.out.println("NOT BALANCED");
            return false;
        }
        
    }
    public static int[] Remove_consecutive_subsequence(int[]arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0){
                st.push(arr[i]);
                continue;
            }
            if(st.peek()==arr[i]){
                if(i==arr.length-1 ||st.peek()!=arr[i+1]){
                    st.pop();
                    continue;
                }
            }
            if(st.peek()!=arr[i]){
                st.push(arr[i]);
            }
        }
        int n=st.size();
        int[]res=new int[n];
        for(int i=n-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static int[] Remove_consecutive_array(int []arr){
        int[]new_arr=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]!=arr[i+1]){
                    new_arr[k++]=arr[i];
                }
                continue;
            }
            if(i==arr.length-1){
                if(arr[i]!=arr[i-1]){
                    new_arr[k++]=arr[i];
                }
                continue;
            }
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                new_arr[k++]=arr[i];          
            }
        }
        return new_arr;
    }
    public static void main(String[] args) {
        // String abc="]";
        // System.out.println(isValid(abc));
        int[]arr={1,1,1,2,3,3,3,3,3,5,7,};
        int[]res=Remove_consecutive_array(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        

        
       
    }
    
}
