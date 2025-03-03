package stacks;

import java.util.Stack;

public class stardom {
    public static void disp_recur(Stack<Integer>st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        // disp_recur(st);
        System.out.print(top+" ");
        disp_recur(st);
        st.push(top);
    }
    public static void insert_at(Stack<Integer>st,int idx,int x){
        Stack<Integer>rt=new Stack<>();
        // if(idx>st.size()){
        //     System.out.println("it will be inserted at end");
        // }
        // if(idx<st.size()){
        //     System.out.println("wrong input");
        //     return;
        // }
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(x);
        while(st.size()>0){
            st.push(rt.pop());
        }
    }

    
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<5;i++){
            st.push(i+1);
           
        }
        System.out.println(st);
        disp_recur(st);
        System.out.println(st);
        // insert_at(st, 2, 100);
       
    }
    
}
