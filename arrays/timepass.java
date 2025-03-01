package arrays;
import java.util.*;
// import java.util.ArrayList;

// import java.util.HashMap;
// import java.util.Stack;

// import java.util.ArrayList;

// import java.util.HashSet;

public class timepass {
    int a;
    int b;
    public timepass(int a,int b){
        this.a=a;
        this.b=b;
    }
    
    public static void zero_end(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0){
                    sigma5.swap(arr, j, j+1);
                }
            }
        }
        sigma5.disp_Array(arr);
    }
    public static void unique_ele(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1000;
                    flag=false;
                }
            }
            if(flag==false){
                arr[i]=-1000;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1000){
                System.out.println("unique element found : "+arr[i]);
                return;
            }
        }
        System.out.println("no unique element found");
        return;
    }
    public static void unique_hashmap(int[]arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            boolean exist=mp.containsKey(arr[i]);
            int value=1;
            if(exist==false){
                mp.put(arr[i],value);
            }
            else{
                mp.put(arr[i], mp.get(arr[i])+1);
            }
        }
        for(var vals:mp.keySet()){
            if(mp.get(vals)==1){
                System.out.println("UNIQUE ELEMENT: "+vals);
                return;
            }
        }
        System.out.println("not found");
        return;
    }
    
   
    public static void main(String[] args) {
        String abc="SMARTH";
        abc=abc.toLowerCase();
        System.out.println(abc);
        // int[]arr={1,1,2,3,3,3,3,3,3,2,3,3,3,33,3,3,3,3,3,3};
        // unique_hashmap(arr);
    //    Stack<Integer> st=new Stack<>();
    //    st.push(1);
    //    st.push(2);
    //    st.push(3);
    //    st.push(4);
    //    System.out.println(st);
    // char[]arr={'a','v','f','f'};
    // String s=new String(arr);
    // StringBuilder sb=new StringBuilder(s);




    
        
        // int[]arr={0,5,7,0,4,3};
        // zero_end(arr);
        // StringBuilder sb=new StringBuilder("hero");
        // sb.deleteCharAt(1);
        // System.out.println(sb);

        // int[]ans={-1};
        // ans=new int[]{-1,-2,-3};
        // for(int i=0;i<ans.length;i++){
        //     System.out.println(ans);
        // }

        

        // ArrayList<String> a1=new ArrayList<>();
        // a1.add("hello");
        // a1.add(" java");
        // // String abc="yoyo";
        // ArrayList<String> a2=new ArrayList<>(a1);
        // System.out.println(a2);
       
        // // a1.addAll(a2);
        // System.out.println(a1);
        // // ArrayList<String> a3=new ArrayList<>();
        // a1.clone();

        

        // HashSet<timepass> h1=new HashSet<>();
        // timepass t1=new timepass(2, 3);
        // h1.add(t1);
        // System.out.println(h1);
    //     String s1="abcd4e";
    //      byte[]arr=s1.getBytes();
    //      for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]);
    //      }
    //      byte b[] = { 97, 98, 99, 100 }; // Range of bytes: -128 to 127. These byte values will be converted into corresponding characters. 
    //     String s = new String(b); 
    //     System.out.println(s);
    //     String str="java is java of java";
    //    System.out.println(str.indexOf('j',14));



        // char[]ch={'d','a','i','v','i','k'};
        // String name2=new String(ch);
        // System.out.println(name2);
        // String name=new String("i am honeya"); 
        // System.out.println(name.length());
        // int ans=name.lastIndexOf("honeya");
        // System.out.println(ans);
        // System.out.println('a'+1);  //SPECIFIED BY VISHAL (BAMBUUU)
        // int[]arr=new int[3];
        // arr[2]=100;
        // int[]arr1=arr;
        // sigma5.disp_Array(arr1);
        // Integer i1= Integer.valueOf(5);
        // System.out.println(i1);
        
    // ArrayList<Integer> list=new ArrayList<>();
    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // System.out.println(list);
    // Integer[]arr=new Integer[list.size()];
    // list.toArray(arr);
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]);
    // } 

        
    


    }  

    
}
