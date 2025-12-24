public class MyLinkedList {
   private Node first;
   private Node last;
   private int count; 
   public void add(Object e){
    if(first==null){
        first=new Node(e,null,null);
        count++;
        last=first;
        
    }
    else{
        last.next=new Node(e,last,null);
        last=last.next;
        count++;
    }
   }
   public void add(int index,Object e){
    if(index<0||index>=size())
        throw new IndexOutOfBoundsException();
    if(index==0){
        Node n=new Node(e,null,first);
        first.prev=n;
        first=n;
        if(first.next==null){
            last=first;
        }
        count++;
        return;
    }
    Node curr=first;
    for(int i=1;i<index;i++){
        curr=curr.next;
    }
    Node n=new Node(e,curr,curr.next);
    curr.next=n;
    n.next.prev=n;
    count++;
    if(n.next==null)
        last=n;
   }
   public int size(){
    return count;
   }
   public Object get(int index){
    if(index<0||index>=size())
        throw new IndexOutOfBoundsException();
    Node curr=first;
    for(int i=1;i<=index;i++){
        curr=curr.next;
    }
    return curr.ele;
   }
   public void remove(int index){
    if(index<0||index>=size())
        throw new IndexOutOfBoundsException();
    Node curr=first;
    if(index==0){
        first=first.next;
        first.prev=null;
        count--;
        return;
    }
    for(int i=1;i<index;i++){
        curr=curr.next;
    }
    
    curr.next=curr.next.next;
    if(curr.next!=null)
        curr.next.prev=curr;
    else
        last=curr;
    count--;
   }
   public void reverse(){
    Node curr=last;
    while(curr!=null){
        System.out.print(curr.ele+" ");
        curr=curr.prev;
    }
   }
   @Override
   public String toString() {
      String res="["+first.ele;
      Node curr=first.next;
      while(curr!=null){
        res+=","+curr.ele;
        curr=curr.next;
      }
      res+="]";
      return res;
   }
   public void set(int index,Object e){
    if(index<0||index>=size())
        throw new IndexOutOfBoundsException();
    Node curr=first;
    for(int i=1;i<=index;i++){
        curr=curr.next;
    }
    curr.ele=e;
   }
}
