

import java.util.Scanner;

class node{
    int data;
    node next;
    node prev;
    node(int val){
        this.data=val;
    }
}
class dll{
    node head=null;
    node tail=null;
    int size=0;
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    int get_at_idx(int idx){
        node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    void add_at_end(int val){
        node temp=new node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        tail.next=temp;
        temp.prev=tail;
        tail=temp;
        size++;
    }
    void delete_head(){
        head=head.next;
        head.prev=null;
        size--;
    }
    void set_at_idx(int idx,int val){
        node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        temp.data=val;
    }
    void delete_at_end(){
        tail=tail.prev;
        tail.next=null;
        size--;
    }
    void delete_at_idx(int idx){
        if(head==null){
            System.out.print("List Is Empty");
            return;
        }
        if(idx<0 || idx>size-1){
            System.out.println("Invalid Indes");
            return;
        }
        if(idx==0){
            delete_head();
            return;
        }
        if(idx==size-1){
            delete_at_end();
            return;
        }
        node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        node temp2=temp.next.next;
        temp.next=temp.next.next;
        temp2.prev=temp2.prev.prev;
        size--;


        
    }
}
class circ_dll{
    int non=0;
    Scanner sc= new Scanner(System.in); 
    node head=null;
    node tail=null;
    void insert_end(){

        System.out.println("Enter the number to insert:");
        int val=sc.nextInt();
        node temp1=head;
        node temp=new node(val);
        // temp.data=val;
        if(temp1==null){
            head=temp;
            head.next=head;
            head.prev=head;
            tail=head;
            non++;
            return;
        }
        tail.next=temp;
        temp.prev=tail;
        tail=temp;
        tail.next=head;
        head.prev=tail;
        non++;
    }
    void insert_begin() {
    System.out.println("Enter the number to insert:");
    int val = sc.nextInt();
    node temp1 = head;
    node temp = new node(val);
    if (temp1 == null) {
        head = temp;
        head.next = head;
        head.prev = head;
        tail = head;
        non++;
        return;
    }
    temp.next = head;
    head.prev = temp;
    head = temp;
    tail.next = head;
    head.prev = tail;
    non++;
}

    void display(){
        node ptr=head;
        System.out.println("Total number of nodes : "+non);
        if(head.next==null){
            System.out.println(head.data);
            return;
}        
        while(ptr.next!=head){
            
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println(ptr.data);
    }
    void delete_end(){
        node temp1=head;
        if(temp1==null){
            System.out.println("LIST is EMPTY");
            return;
        }
        node ptr =tail.prev;
        ptr.next=head;
        head.prev=ptr;
        tail=ptr;
        non--;
    }
    void delete_begin(){
        node temp1=head;
        if(temp1==null){
            System.out.println("LIST is EMPTY");
            return;
        }
        head=head.next;
        tail.next=head;
        head.prev=tail;
        non--;
    }
    void delete_pos(){
        System.out.println("ENTER postion at which u want to delete: ");
        int pos=sc.nextInt();
        if(pos>non || pos<0){
            System.out.println("POSITION out of BOUND");
            return;
        }
        node temp1=head;
        if(temp1==null){
            System.out.println("LIST is EMPTY");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            non--;
            return;
            //As trick start the trick  
        }
        if(pos==1){
            delete_begin();
            return;
        }
        for(int i =1;i<pos-1;i++){
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        node ptr=temp1.next;
        ptr.prev=temp1;
        non--;
    }
    void delete_index(){
        System.out.println("ENTER index at which u want to delete: ");
        int idx=sc.nextInt();
        if(idx>non-1 || idx<0){
            System.out.println("INDEX out of BOUND ");
            return;
        }
        node temp1=head;
        if(temp1==null){
            System.out.println("LIST is EMPTY");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            non--;
            return;
        }
        if(idx==0){
            delete_begin();
            return;
        }
        for(int i=1;i<idx;i++){
            temp1=temp1.next;
        }
        node ptr=temp1.next.next;
        temp1.next=ptr;
        ptr.prev=temp1;
        non--;
    }
    void delete_at_data(){
        System.out.println("ENTER the KEY to delete : ");
        int key=sc.nextInt();
        node temp1=head;
        if(temp1==null){
            System.out.println("LIST is EMPTY ");
            return;
        }
        while(temp1.data!=key && temp1.next!=head){
            temp1=temp1.next;
        }
        if(temp1==head && head.next==null){
            head=null;
            tail=null;
            non--;
        }
        if(temp1==head && head.next!=null){
            delete_begin();
            return;
        }
        if(temp1.data==key){
        node ptr1=temp1.prev;
        node ptr2=temp1.next;
        ptr1.next=ptr2;
        ptr2.prev=ptr1;
        non--;
        return;
        }
        System.out.println("KEY is not PRESENT");
    }
}

public class DLL1_circ {
    public static void main(String[] args) {
       dll a=new dll();
       a.add_at_end(10);
       a.add_at_end(20);
       a.add_at_end(30);
       a.add_at_end(40);
       a.add_at_end(40);
       a.add_at_end(50);
       a.set_at_idx(2, 100);
       a.display();
       System.out.println(a.get_at_idx(5));

    }

    
}

