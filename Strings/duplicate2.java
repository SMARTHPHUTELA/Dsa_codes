package Strings;

import java.util.Scanner;

public class duplicate2 {
    public static String remove_duplicate(String abc){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<abc.length();i++){
            char ch =abc.charAt(i);
            if(sb.indexOf(String.valueOf(ch))==-1){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter String");
        String abc=sc.next();
        String ans=remove_duplicate(abc);

        System.out.println(ans);
        sc.close();
    }
    
}
