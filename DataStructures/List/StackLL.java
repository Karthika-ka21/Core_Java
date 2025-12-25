public class StackLL {
    private int count;
    private SingleNode top;
    public void push(Object e){
        if(top==null){
            top=new SingleNode(e);
            count++;
            return;
        }
        SingleNode n=new SingleNode(e,top);
        top=n;
        count++;
    }
    public Object pop(){
        Object item=top.ele;
        top=top.next;
        count--;
        return item;
    }
    public int size(){
        return count;
    }
    public Object peek(){
        return top.ele;
    }
    public boolean isEmpty(){
        return count==0;
    }
}
