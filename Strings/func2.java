package Strings;

public class func2 {
    public static void compress(String abc){
        StringBuilder sb=new StringBuilder(abc);
        String efg="";
        for(int i=0;i<abc.length();i++){
            if(sb.charAt(i)=='*'){
                continue;
            }
            int count=1;
            @SuppressWarnings("unused")  //---IMPORTANT---
            boolean flag=false;
            for(int j=i+1;j<abc.length();j++){
                if(abc.charAt(i)==abc.charAt(j)){
                    sb.setCharAt(j, '*');
                    flag=true;
                    count++;
                }
            }
            efg=efg+abc.charAt(i);
            if(count>1){
                efg+=count;
            }
           
        }
        System.out.println(efg);
    }
    public static void compress2(String abc){
        StringBuilder sb=new StringBuilder();
        int count=1;
        sb.append(abc.charAt(0));
        for(int i=1;i<abc.length();i++){
            if(abc.charAt(i-1)==abc.charAt(i)){
                count++;
            }
            else{
                if(count>1){
                    sb.append(count);
                }
                sb.append(abc.charAt(i));
                count=1;

            }
        }
        if(count>1){
            sb.append(count);
        }
        System.out.println(sb);
    }
    
    public static void main(String[] args) {
        String abc="aaabbbcaadde";
        compress2(abc);
        compress(abc);
        // System.out.println(abc+'l'+(2+1));
    }
    
}
