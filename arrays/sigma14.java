package arrays;



// import java.util.*;

/*    MATRIX SCORE
                 *    SEARCH IN 2D ARRAY(OPTIMAL APPROACH)
                 *    SET METRIX TO ZERO
                 *    LARGEST ROW WITH MAX SUM
                 *    MAX ELEMENT
                 *    MATRIX SCORE
                 */
public class sigma14 {
    public static void flip(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
    }
    public static void matrix_score(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        for (int j = 1; j < arr[0].length; j++) {
            int no_of_zero = 0;
            int no_of_ones = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == 0) {
                    no_of_zero++;
                } else {
                    no_of_ones++;
                }
            }
            if (no_of_zero > no_of_ones) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        int score = 0;
        int multiplier = 1;
        for (int j = arr[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < arr.length; i++) {
                score += arr[i][j] * multiplier;
            }
            multiplier = multiplier * 2;
        }
        System.out.println(score);
    }
    //                   APPROACH 1  (using mn space)
    public static void set_matrix_zero(int[][]arr){
        int [][]helper=new int[arr.length][arr[0].length];
        for(int i=0;i<helper.length;i++){
            for(int j=0;j<helper[0].length;j++){
                helper[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(helper[i][j]==0){
                    for(int k=0;k<arr[0].length;k++){
                        arr[i][k]=0;
                    }
                    for(int k=0;k<arr.length;k++){
                        arr[k][j]=0;
                    }
                }
            }
        }
    }
    //                  APPROACH 2   (using m+n space)
    public static void set_matrix_zero2(int[][]arr){
        boolean[]row=new boolean[arr.length];
        boolean[]col=new boolean[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(row[i]==true){
                for(int j=0;j<arr[0].length;j++){
                    arr[i][j]=0;
                }
            }
        }
        for(int j=0;j<arr[0].length;j++){
            if(col[j]==true){
                for(int i=0;i<arr.length;i++){
                    arr[i][j]=0;
                }
            }
        }
    } 
    //     APPROACH 3   (INPLACE No extra space)

    public static void set_matrix_zero3(int[][]arr){
        boolean row=false;
        boolean col=false;
        for(int j=0;j<arr[0].length;j++){
            if(arr[0][j]==0){
                col=true;
                break;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            if(arr[i][0]==0){
                row=true;
                break;
            }
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    arr[0][j]=0;
                    arr[i][0]=0;
                }
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]==0){
                for(int j=1;j<arr[0].length;j++){
                    arr[i][j]=0;
                }
            }
        }
        for(int j=1;j<arr[0].length;j++){
            if(arr[0][j]==0){
                for(int i=0;i<arr.length;i++){
                    arr[i][j]=0;
                }
            }
        }
        if(col==true){
            for(int j=0;j<arr[0].length;j++){
                arr[0][j]=0;
            }
        }
        if(row==true){
            for(int i=0;i<arr.length;i++){
                arr[i][0]=0;
            }
        }
    }

    public static boolean search_2d(int[][]arr,int target){
        int i=arr.length-1;
        int j=0;
        while(i>=0 && j<arr[0].length){
            if(arr[i][j]==target){
                return true;
            }
            else if(arr[i][j]>target){
                i--;
            }
            else{
                j++;
            }
        }
        return false;
    }
    public static void largest_element(int[][]arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static void largest_row_sum(int[][]arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[0].length; j++) {
                sum+=arr[i][j];
            }
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
    
    public static void main(String[] args) {
        int[][]a={{1,2,6},{1,0,7},{1,5,1}};
        sigma12.disp2d(a);
        largest_element(a);
        largest_row_sum(a);
        // sigma12.disp2d(a);
        
    }
    
}
