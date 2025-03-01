package arrays;

import java.util.Scanner;

public class sigma5 {
    public static void disp_Array(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void swap(int a,int b){
        // int temp=a;
        // a=b;
        // b=temp;

        //    METHOD 2 (WITHOUT USING THIRD VARIABLE)
        a=b+a;
        b=a-b;
        a=a-b;

        System.out.println("a : "+a+"  b : "+b);
    }
    public static void ReverseArray(int[]arr){
        int n=arr.length;
        int j=0;
        int[]arr1=new int[n];
        for(int i=n-1;i>=0;i--){
            arr1[j++]=arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
    public static void ReverseInPlace(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void particular_reverse(int[]arr,int idx1,int idx2){
        if(idx1>=idx2){
            System.out.println("invalid input");
        }
       while(idx1<idx2){
        swap(arr, idx1,idx2);
        idx1++;
        idx2--;
       }
      
    }
    public static int[] Rotate(int[]arr,int k){
        int n = arr.length;
        int[]ans=new int[n];
        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void RotateInPlace(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        particular_reverse(arr,0,n-k-1);
        particular_reverse(arr, n-k, n-1);
        particular_reverse(arr, 0, n-1);
    }
    public static int[] make_frequency(int[]arr){
        int[]freq=new int[1000005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;

    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=10;
        // int b=20;
        // swap(a, b);
        // System.out.println(a);
        int[]arr={1,2,3,4,5,6,7,6,6,6,7,3,4};
        // disp_Array(arr);
        // Rotate(arr, 3);
        // int[]ans=Rotate(arr, 3);
        // disp_Array(ans);
        // ReverseInPlace(arr);
        // RotateInPlace(arr, 5);
        // disp_Array(arr);
        // System.out.println(arr[0]);
        // ReverseArray(arr);
        System.out.println("enter number of queires:  ");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter th value of element to be found: ");
            int x=sc.nextInt();
            int[]freq=make_frequency(arr);
            if(freq[x]>0){
                System.out.println("YES,this element is present in the array "+freq[x]+" times");

            }
            else{
                System.out.println(" NOT PRESENT IN ARRAY ");
            }
            q--;
        }
        sc.close();



    }
    
}
