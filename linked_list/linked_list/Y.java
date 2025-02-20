package linked_list;

public class Y {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class LinkList{
        Node head=null;
        Node tail=null;
        int size=0;
        Node h=head;
        void insert_at_end(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        void insert_at_begin(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp; 
            }
            size++;
        }
        void display(){
            Node temp=head;
            if(temp==null){
                System.out.println("list is empty ");
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void insert_at(int idx,int val){
            Node temp1=new Node(val);
            Node temp=head;
            if(head==null){
                head=temp1;
                tail=temp1;
                return;
            }
            else if(idx==size){
                insert_at_end(val);
                return;
            }
            else if(idx==0){
                insert_at_begin(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("WRONG INDEX ");
                return;
            }
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            temp1.next=temp.next;
            temp.next=temp1;

        }
        public  void display_rec(Node h){
            if(h==null){
                return;
            }
            display_rec(h.next);
            System.out.print(h.data+" ");
    
        }
        public  void display2(){
            display_rec(head);

            
        }

    }
    
    
    public static void main(String[] args) {
        LinkList l1=new LinkList();
    //    l1.display();
       
        
        // l1.display();
        l1.insert_at_end(10);
        l1.insert_at_end(17);
        l1.insert_at_begin(12);
        l1.display();
        l1.display2();
        // l1.insert_at(1,35 );
        // l1.insert_at(2, 100);
        // l1.display();
        // System.out.println(l1.head.data);
    }
    
}
