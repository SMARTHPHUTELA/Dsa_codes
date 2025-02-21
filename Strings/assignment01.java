package Strings;

public class assignment01 {
    public static void update_string(String abc){
        StringBuilder sb=new StringBuilder(abc);
        for(int i=0;i<sb.length();i++){
            if(i%2!=0){
                sb.setCharAt(i, '#');
            }
        }
        System.out.println(sb);
    } 
    public static void count_consonent_vowel(String abc){
        int vow=0;
        int con=0;
        abc=abc.toLowerCase();

        for(int i=0;i<abc.length();i++){
            char ch=abc.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow++;
            }
            else if(ch>='a' && ch<='z'){
                con++;
            }
            else{
                continue;
            }
        }
        System.out.println("No of vowels: "+vow+"\n"+"No of consonants: "+con);
    }
    public static boolean check_palindrome(String abc){
        int i=0;int j=abc.length()-1;
        while(i<j){
            if(abc.charAt(i)!=abc.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void half_reverse(String abc){
        StringBuilder sb=new StringBuilder(abc);
        int i=abc.length()/2;
        int j=abc.length()-1;
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(sb); 
    }
    public static void concat_reverse(String abc){
        StringBuilder sb=new StringBuilder(abc);
        sb.reverse();
        abc+=sb;
        System.out.println(abc);
    }
    
    public static void lexo_max(String abc){
        int space=0;
        for (int i = 0; i <abc.length(); i++) {
            char ch=abc.charAt(i);
            if(ch==' '){
                space++;
            }
        }
        String[]arr=new String[space+1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder();
            while(j<abc.length()){
                char ch=abc.charAt(j);
                if(ch!=' '){
                    sb.append(ch);
                    j++;
                }
                else{
                    j++;
                    break;
                }
            }
            arr[i]=sb.toString();
        }
        String maxS=arr[0];
        for(int i=1;i<arr.length;i++){
            maxS=maximum(maxS,arr[i]);
        }
        System.out.println(maxS);
    } 
    public static String maximum(String s,String t){
        if(s.compareTo(t)>0){
            return s;
        }
        else{
            return t;
        }
    }



    public static void main(String[] args) {
        String abc="smarth is good zzzz boy zack";
        // update_string(abc);
        // count_consonent_vowel(abc);
        // System.out.println(check_palindrome(abc));
        // half_reverse(abc);
        // concat_reverse(abc);
        lexo_max(abc);


    }
    
}
