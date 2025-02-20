package linked_list;
// package linked_list;

// class NODE{
//     int data;
//     NODE next;
//     NODE(int data){
//         this.data=data;
//     }
    

// }


// public class X {
//     public static void print_ll(NODE temp){
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public static NODE deleteNthAtEnd(NODE head,int n){
//        NODE slow=head;
//        NODE fast=head;
       
//        for(int i =1;i<=n;i++){
//         fast=fast.next;
//        }
//        if(fast==null){
//         head=head.next;
//         return head;
//        }
//        while(fast.next!=null){
//         slow=slow.next;
//         fast=fast.next;
//        }
//        slow.next=slow.next.next;
//        return head;
//     }

//     public static NODE intersection(NODE head1,NODE head2){
//         NODE temp1=head1;
//         NODE temp2=head2;
//         int size1=0;
//         int size2=0;
//         while(temp1!=null){
//             temp1=temp1.next;
//             size1=size1+1;   
//         }
//         temp1=head1;
//         while(temp2!=null){
//             temp2=temp2.next;
//             size2=size2+1;
//         }
//         temp2=head2;
//         if(size1>=size2){
//             for(int i=1;i<=size1-size2;i++){
//                 temp1=temp1.next;
//             }
//         }
//         else{
//             for(int i=1;i<=size2-size1;i++){
//                 temp2=temp2.next;
//             }
//         }
//         while(temp1!=temp2){
//             temp1=temp1.next;
//             temp2=temp2.next;
            
//         }
//         return temp1;

//     }
//     public static void displayRec(NODE h){
//         if(h==null){
//             return;
//         }
//         displayRec(h.next);
//         System.out.print(h.data+ " ");
//     }

    
//     public static void main(String[] args) {
//         NODE n1=new NODE(1);
//         NODE n2=new NODE(2);
//         NODE n3=new NODE(3);
//         NODE n4=new NODE(4);
//         NODE n5=new NODE(5);
//         NODE n99=new NODE(99);
//         NODE n98=new NODE(98);
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
//         n98.next=n99;
//         n99.next=n4;
//         print_ll(n1); 
//         displayRec(n1); 
        
       


//     }   
// }

