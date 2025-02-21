package Strings;

public class func1 {
    public static boolean is_palindrome(String abc){
        int i=0;
        int j=abc.length()-1;
        while(i<j){
            if(abc.charAt(i)!=abc.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void reverse_each_element(String abc){
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<abc.length();i++){
            char ch= abc.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                // sb.delete(0, sb.length());
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // String abc="abba";
        // // @SuppressWarnings("unused")
        // int count =0;
        // for(int i=0;i<=abc.length()-1;i++){
        //     for(int j=i+1;j<=abc.length();j++){ 
        //         if(is_palindrome(abc.substring(i, j))==true){
        //             System.out.print(abc.substring(i, j)+" ");
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);
        String abc="i am smarth";
        reverse_each_element(abc);
    }
    
}
