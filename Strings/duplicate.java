package Strings;

public class duplicate {
    public static String remove(String abc){
        String xyz="";
        StringBuilder sb=new StringBuilder(abc);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='*'){
                continue;
            }
            char ch=sb.charAt(i);
            for(int j=i+1;j<sb.length();j++){
                if(ch==sb.charAt(j)){
                    sb.setCharAt(j, '*');
                }
            }
            xyz+=sb.charAt(i);
        }
        
        // for(int i=0;i<sb.length();i++){
        //     if(sb.charAt(i)=='*'){
        //         continue;
        //     }
        //      xyz+=sb.charAt(i);
        // }
        return xyz;
    }
    public static void main(String[] args) {
        String abc="aabababbbccbad";
        System.out.println(remove(abc));
    }
    
}
