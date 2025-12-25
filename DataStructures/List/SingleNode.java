public class SingleNode{
    Object ele;
    SingleNode next;
    SingleNode(Object e){
        ele=e;
    }
    SingleNode(Object e,SingleNode n){
        ele=e;
        next=n;
    }
}