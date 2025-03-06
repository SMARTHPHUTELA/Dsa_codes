package recursion;

public class sprit {
    static void pi(int n){
        // if(n==1){
        //     System.out.println(n);
        //     return;
        // }
        if(n<=0){
            // System.out.println("invalid input");
            return;
        }
        System.out.print(n+" ");
        pi(n-1);
    }

    static int fac_rec(int n){
        int fac=1;
        if(n==0){
            return 1;
        }
        if(n<0){
            return -1;
        }
        fac=n * fac_rec(n-1);
        return fac;

    }
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int prev=fib(n-1);
        int prevprev=fib(n-2);
        int ans=prev+prevprev;
        return ans;        
    }

    public static void main(String[] args) {
        int n=3;
        pi(n);
        System.out.println();
        // int res= fac_rec(n);
        // System.out.println(res);
        int fibonacci=fib(n);
        System.out.println(fibonacci);
        for(int i=0;i<=10;i++){
            System.out.print(fib(i)+" ");
        }
    }
    
}
