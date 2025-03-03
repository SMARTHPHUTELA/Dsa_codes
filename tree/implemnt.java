package tree;
import java.util.*;
class tnode{
    int val;
    tnode left;
    tnode right;
    tnode(int val){
        this.val=val;
    }
}

public class implemnt {
    static tnode prev=null;
    public static void display(tnode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int sum_nodes(tnode root){
        if(root==null){
            return 0;
        }
        return root.val+sum_nodes(root.left)+sum_nodes(root.right);
    }
    public static int product_nodes(tnode root){
        if(root==null){
            return 1;
        }
        return root.val*product_nodes(root.left)*product_nodes(root.right);
    }
    public static int product_nonzero(tnode root){
        if(root==null){
            return 1;
        }
        if(root.val==0){
            return product_nonzero(root.left)*product_nonzero(root.right);
        }
        return root.val*product_nonzero(root.left)*product_nonzero(root.right);
    }
    public static int max_node_val(tnode root){
        if(root==null){
            return -1;
        }
        return Math.max(root.val,Math.max(max_node_val(root.left),max_node_val(root.right)));
    }
    public static int min_node_val(tnode root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int left_min=min_node_val(root.left);
        int right_min=min_node_val(root.right);
        return Math.min(root.val,Math.min(left_min,right_min));
    }
    public static int size_tree(tnode root){
        if(root==null){
            return 0;
        }
        int left_node=size_tree(root.left);
        int right_node=size_tree(root.right);
        return 1+left_node+right_node;
    }
    public static int level_tree(tnode root){
        if(root==null){
            return 0;
        }
        int left_lvl=level_tree(root.left);
        int right_lvl=level_tree(root.right);
        return 1+Math.max(left_lvl,right_lvl);
    }
    public static void inorder_bst(tnode root,int x){
        if(root==null) return;
        inorder_bst(root.left,x);
        System.out.println(root.val);
        inorder_bst(root.right, x);
        
    }
    public static void range(tnode root,int low,int high,ArrayList<Integer>arr){
        if(root==null) return;
        if(root.val>=low && root.val<=high){
            arr.add(root.val);
        }
        range(root.left, low, high, arr);
        range(root.right, low, high, arr);
    }
    public static void range_bst(tnode root,int low,int high,ArrayList<Integer> arr){
        if(root==null) return;
        if(root.val>=low && root.val<=high){
            arr.add(root.val);
            range_bst(root.left, low, high, arr);
            range_bst(root.right, low, high, arr);
        }
        else if(root.val>high){
            range_bst(root.left, low, high, arr);
        }
        else{
            range_bst(root.right, low, high, arr);
        }
    }
        public static void main(String[] args) {
        tnode a=new tnode(50);
        tnode b=new tnode(30);
        tnode c=new tnode(70);
        tnode d=new tnode(20);
        tnode e=new tnode(40);
        tnode f=new tnode(90);
        tnode g=new tnode(60);
        
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=g;
        c.right=f;
        display(a);
        System.out.println();
        ArrayList<Integer>arr=new ArrayList<>();
        // range(a, 30, 40, arr);
        range_bst(a, 30,60 , arr);
        System.out.println(arr);
    
    }
    
}
