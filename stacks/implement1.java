package stacks;

public class implement1 {
    int MAX=7;
    int[]arr=new int[MAX];
    int idx=0;
    // private int size=0;
    public void push(int p){
        if(idx==arr.length){
            System.out.println("Stack overflow");
            return;
        }
        arr[idx++]=p;
        // size++;
    }
    public int pop(){
        if(idx==0){
            System.out.println("Stack underFlow");
            return Integer.MIN_VALUE;
        }
        int poped=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        // size--;
        return poped;
    }
    public int peek(){
        int peeked=arr[idx-1];
        return peeked;
    }
    public int size(){
        return idx;
    }
    public boolean isFull(){
        if(idx==arr.length){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        return false;
    }
    public void  display(){
        if(idx==0){System.out.println("Stack is empty");
        return;

        }
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void reverse_rec(){
        if(size()==1){
            return;
        }
        int top=this.pop();
        this.reverse_rec();
        pushAtBottom(top);
    }
    public void pushAtBottom(int x){
        if(size()==0){
            push(x);
            return;
        }
        int top=pop();
        pushAtBottom(x);
        push(top);

    }

    public static void main(String[] args) {
        implement1 qt=new implement1();
        implement1 st=new implement1();
        // implement1 rt=new implement1();
        for(int i=1;i<5;i++){
            st.push(i);
        }
        st.display();
        qt.push(5);
        qt.display();
        
        st.reverse_rec();
        st.display();
        
       
        
    }

    
}
