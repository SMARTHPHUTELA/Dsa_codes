package arrays;

import java.util.Scanner;

public class timepass1 {
    public static int single_element(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=Integer.MIN_VALUE;
                    arr[j]=Integer.MIN_VALUE;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=Integer.MIN_VALUE){
                return arr[i];
            }
        }
        return -1;
    }
    public static void sec_max(int[]arr){
        int max=arr[0];
        int second=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                second=max;
                max=arr[i];
            }
            else if(arr[i]>second){
                second=arr[i];
            } 
        }
        System.out.println(second);
    }
    public static void tggle(String abc){
        StringBuilder sb=new StringBuilder(abc);
        for(int i=0;i<abc.length();i++){
            char ch=abc.charAt(i);
            int asci=(int)ch;
            if(asci>97){
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
    public static void string_reverse(){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(sb);
        sc.close();
    }
    public static void reverse_each_word(String abc){
        String ans="";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <abc.length(); i++) {
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
        System.out.println(ans.trim());
    }
    public static boolean isomorphic(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[]arr=new char[128];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char dh=t.charAt(i);
            int idx=(int)(ch);
            if(arr[idx]=='\0'){
                arr[idx]=dh;
            }
            else{
                if(arr[idx]!=dh){
                    return false;
                }
            }
        }
        return true;

    }
    public static void String_convert(String[]arr){
        int maximum=0;
        for(int i=0;i<arr.length;i++){
            Integer num=Integer.valueOf(arr[i]);
            maximum=Math.max(num,maximum);
        }
        System.out.println(maximum);
        
    }
    public static void next_greater(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                arr[i]=0;
            }
            boolean flag=true;
            for (int j =i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    flag=false;
                    arr[i]=arr[j];
                    break;
                }
                
            }
            if(flag==true){
                arr[i]=0;
            }
            
        }
    }
    public static void main(String[] args) {
        String s=" i am Smarth Phutela    ";
        s=s.trim();
        System.out.println(s);
        // reverse_each_word(s);
        // int[]arr={11,3,2,0,64,45,0,9};
        // sigma5.disp_Array(arr);
        // next_greater(arr);
        // sigma5.disp_Array(arr);
        // int []arr1=new int[128];
        // char[]arr={'a','b','c'};
        // for(char ch:arr){
        //    System.out.println(arr1[ch]++);
        // }
        // int[]abc={0,3,5,3,11,43,5};
        // sec_max(abc);
        // String s="PhySicsWaLLahSkills";
        // String t="";
        // for(int i=0;i<s.length();i++){
        //     if(i%2==0){
        //         t+='a';
        //     }
        //     else{
        //         t+=s.charAt(i);
        //     }
        // }
        // System.out.println(s);
        // System.out.println(t);
        // tggle(s);
        
        
        // String abc="smarth";
        // char ch=abc.charAt(0);
        // int[][]arr={{1,2},{3,4},{5,6}};
        // for(var one:arr){
        //     for(var two:one){
        //         System.out.print(two+" ");
        //     }
        //     System.out.println();
        // }
        

    }
}
