package hashmap;

import java.util.HashMap;

public class compare_hashmap {
    public static HashMap<Character,Integer> make_frequency(String str){
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int value=1;
            boolean exist=mp.containsKey(str.charAt(i));
            if(exist==true){
                mp.put(ch,mp.get(ch)+value);
            }
            else{
                mp.put(ch,value);
            }
        }
        return mp;
    }
    public static void main(String[] args) {
        String s="keEn";
        String t="knEe";
        HashMap<Character,Integer> mp1=make_frequency(s);
        // HashMap<Character,Integer> mp2=make_frequency(t);
        // if(mp1.equals(mp2)==true){
        //     System.out.println("ITS ANAGRAM ");
        // }
        // else{
        //     System.out.println("NOT AN ANAGRAM");
        // }
        for(int i=0;i<t.length();i++){
            Character ch= Character.valueOf(t.charAt(i));
            boolean exist=mp1.containsKey(ch);
            if(exist==true){
               int val= mp1.get(ch);
               mp1.put(ch, val-1);

            }
            if(exist==false){
                System.out.println("NOt");
                return;
            }
        }
        for(var value:mp1.values()){
            if(value!=0){
                System.out.println("not an anagram");
                return;
            }
        }
        System.out.println("its anaGRAM");
    }
    
}
