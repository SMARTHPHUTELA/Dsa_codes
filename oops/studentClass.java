package oops;

public class studentClass {
    static void cheak(student s){
        s.name="Smarth";
    }
    public static void main(String[] args) {
        student s1=new student();
        s1.name="Dia";
        System.out.println(s1.name);
        cheak(s1);
        System.out.println(s1.name);
    }
    
}
