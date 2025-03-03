package hashmap;

import java.util.LinkedList;

public class implement_h{

    public static class myhash<k,v>{
        private static final float default_load_factor=0.75f;
        private int N;// SIZE OF HASH TABLE
        private int n=0;//number of enteries in table
        class node{
            private k key;
            private v value;
            node(k key, v value){
                this.key=key;
                this.value=value;
            }
        }
        public int sizeee(){
            return n;
        }
        LinkedList<node>[]bucket;
         //PREDICT WARNINGS
        myhash(int size_of_table){
            this.N=size_of_table;
            ll_in_bucket(N);
            
        }
        @SuppressWarnings("unchecked")
        private void ll_in_bucket(int N){
            bucket=new LinkedList[N];
            for(int i=0;i<bucket.length;i++){
                bucket[i]=new LinkedList<node>();
            }
        }
        private int search_in_ll(LinkedList<node> l1,k key){
            for(int i=0;i<l1.size();i++){
                if(l1.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        private int hashval(k key){
            int hc=(key.hashCode())%N;
            return Math.abs(hc);
        }

        private void rehash(){
            LinkedList<node> []old_bucket=bucket;
            ll_in_bucket(old_bucket.length*2);
            for(var b:old_bucket){
                for(var n:b){
                    put(n.key,n.value);
                }
            }
        }
        public void put(k key,v value){
            int bi=hashval(key);
            LinkedList<node> currentll=bucket[bi];
            int elm=search_in_ll(currentll,key);
            if(elm==-1){
                node n1=new node(key,value);
                currentll.add(n1);
                n++;
            }
            else{
                node current_node=currentll.get(elm);
                current_node.value=value; 
            }
            if(n>=N*default_load_factor){
                rehash();
            }
        }
        public v get(k key){
            int bi=hashval(key);
            LinkedList<node> currentll=bucket[bi];
            int elm=search_in_ll(currentll, key);
            if(elm!=-1){
                node current_node=currentll.get(elm);
                return current_node.value;
            }
            return null;
        }

        public void remove(k key){
            int bi=hashval(key);
            LinkedList<node> currentll=bucket[bi];
            int elm=search_in_ll(currentll, key);
            if(elm!=-1){
                node current_node= currentll.get(elm);
                v val=current_node.value;
                currentll.remove(val);
                n--;
            }
            
        }

        public static void main(String[] args) {
            myhash<String,Integer> mp =new myhash<>(4);
            mp.put("SMARTH", 212);
            mp.put("DIA", 58);
            mp.put("SMARTH", 2222);

            int size=mp.sizeee();
            System.out.println(size);
            System.out.println(mp.get("SMARTH"));
            System.out.println(mp.get("college"));
            mp.remove("SMARTH");
            size=mp.sizeee();
            System.out.println(size);

        }
    }
    
}
