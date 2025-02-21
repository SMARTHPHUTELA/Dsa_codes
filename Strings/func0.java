package Strings;

public class func0 {
    public static void print_substring(String abc){
        int len=abc.length();
        for(int i=0;i<=len-1;i++){
            for(int j=i+1;j<=len;j++){
                System.out.print(abc.substring(i,j)+" ");
            }
        }
    }
    public void toggle(String abc){
        StringBuilder sb=new StringBuilder(abc);
        for(int i=0;i<abc.length();i++){
            if(sb.charAt(i)==' '){
                continue;
            }

            char ch=sb.charAt(i);
            int asci=(int)ch;
            if(asci>=97){
                asci-=32;
                char dh=(char)asci;
                sb.setCharAt(i, dh);
            }
            else{
                asci+=32;
                char dh =(char)asci;
                sb.setCharAt(i, dh);
            }
        } 
        System.out.println(sb);
    }
     

    public static void main(String[] args) {
        String str="gadag";
        // System.out.println(str);
        print_substring(str);
        // func0 f1=new func0();
        // f1.toggle(str);
        // char[]arr={'2','3','a','c'};
        // String str=new String(arr);
        // System.out.println(str);
    }
}