package oops;

public class fraction {
    public static frac add(frac a,frac b){
        int n1=((a.num*b.den)+(b.num+a.den));
        int d1=a.den*b.den;
        frac f3=new frac(n1,d1);
        return f3;
    }
    public static int gcd(int n,int d){
        int min=Math.min(n, d);
        for(int i=min;i>=1;i--){
            if(n%i==0 && d%i==0){
                return i;
            }
        }
        return 0;

    }
    public static void simplify0(frac f){
        int hcf=gcd(f.num,f.den);
        f.num=f.num/hcf;
        f.den=f.den/hcf;

    }
    public static class frac{
        int num;
        int den;
        frac(int num,int den){
         this.num=num;
            this.den=den;
            simplify1();
        }
        public void simplify1(){
            int hcf=gcd(num,den);
            num/=hcf;
            den/=hcf;

        }

    }
    public static void main(String[] args) {
        frac f1=new frac(1,2);
        System.out.println(f1.num+"/"+f1.den);
        frac f2=new frac(1,8);
        System.out.println(f2.num+"/"+f2.den);
        frac f3=add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);

    }
    
}
