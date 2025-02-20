

import java.util.Scanner;

class block{
    int data;
    block next;
    block(int data){
        this.data=data;
    }
}

public class singlell {
    Scanner sc=new Scanner(System.in);
    block head=null;
    block tail=null;
    int tn=0;
    public void insert_last(){
        System.out.println("Enter the data");
        int val=sc.nextInt();
        block temp1=head;
        block temp=new block(val);
        if(temp1==null){
            head=temp;
            tail=temp;
            return;
        }
        tail.next=temp;
        tail=temp;
        
    }
    
}
