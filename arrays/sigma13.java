package arrays;
                 /* MATRIX MULTIPLICATION 
                  * PASCAL TRIANGLE( 2D ARRAYLIST)
                    SPIRAL PRINT 
                  */
import java.util.*;

public class sigma13 {
    public static void matrix_multi(int[][]a,int[][]b){
        if(a[0].length==b.length){
            int[][]c=new int[a.length][b[0].length];
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    for(int k=0;k<a[0].length;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("cant br multiplied ");
        }
    }
    public static void pascal_triangle(int n){// n= no of rows in a triangle
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> in=new ArrayList<>();
            for(int j=0;j<=i;j++){
                in.add(1);
            }
            ans.add(in);
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
                int set_val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                ans.get(i).set(j,set_val);
            }
        }
        System.out.println(ans);
    }
    public static void spiral_print(int[][]arr){
        int minr=0;
        int minc=0;
        int maxr=arr.length;
        int maxc=arr[0].length;
        while(minr<=maxr-1 && minc<=maxc-1){
            for(int j=minc;j<maxc;j++){
                System.out.print(arr[minr][j]+" ");
            }
            minr++;
            if(minr>maxr-1 || minc>maxc-1){
                break;
            }
            for(int i=minr;i<maxr;i++){
                System.out.print(arr[i][maxc-1]+" ");
            }
            maxc--;
            if(minr>maxr-1 || minc>maxc-1){
                break;
            }
            for(int j=maxc-1;j>=minc;j--){
                System.out.print(arr[maxr-1][j]+" ");
            }
            maxr--;
            if(minr>maxr-1 || minc>maxc-1){
                break;
            }
            for(int i=maxr-1;i>=minr;i--){
                System.out.print(arr[i][minc]+" ");
            }
            minc++;
        }
    }
    public static void main(String[] args) {
        int[][]abc={{1,2,3,10,20},{4,5,6,30,40},{7,8,9,50,60}};
        // sigma12.disp2d(abc);
        spiral_print(abc);
        // int[][]a={{3,7},{4,9}};
        // int[][]b={{6,2},{5,8}};
        // matrix_multi(a, b);
        // pascal_triangle(3);
        
    }
    
}
