package Strings;

public class good {
    public static String purify(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                return s.substring(i);
            }
        }
        return "";
    }
    public static String max(String a,String b){
        String s=purify(a);
        String t=purify(b);
        if(s.length()>t.length()){
            return a;
        }
        if(t.length()>s.length()){
            return b;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>t.charAt(i)){
                return a;
            }
            if(s.charAt(i)<t.charAt(i)){
                return b;
            }
        }
        if(a.length()>b.length()){
            return a;
        }
        else{
            return b;
        }

    }
    public static void largest_num_String(String[]arr){
        String maxS=arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxS=max(arr[i],maxS);
        }
        System.out.println(maxS);
    }
    public static void main(String[] args) {
        String[]arr={"1234","000056","9875","000000"};
        largest_num_String(arr);

    }
    
}
