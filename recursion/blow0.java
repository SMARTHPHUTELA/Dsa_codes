package recursion;
                /*   Maze
                 *   Stair 
                 *   power lograthamic 
                 *  
                 */

public class blow0 {
        //  (m,n)   to      (1,1)
    public static int  maze(int m,int n){
        if(m==1 || n==1){
            return 1;
        }
        int rightways=maze(m,n-1);
        int downways=maze(m-1,n);
        int ans=rightways+downways;
        return ans;
    }
    public static  int Stair_way(int n){
        //    1 and 3 step jump is allowed
        if(n==1){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int ans=Stair_way(n-1)+Stair_way(n-3);
        return ans;
    }
    public static int  pow_log(int a,int b){
        int ans=-1;
        int ans_new=-1;
        if(b==0){
            return 1;
        }
        if(b%2==0){
            ans=pow_log(a, b/2);
            ans_new=ans*ans;
        }
        if(b%2!=0){
            ans=pow_log(a, b/2);
            ans_new=ans*ans*a;
        }
        return ans_new;
    }
    public static void main(String[] args) {
        System.out.println(pow_log(2, 3));
        System.out.println(Stair_way(4));
        System.out.println(maze(4, 4));
    }
    
}
