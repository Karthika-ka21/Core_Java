public class Stack{
    MyArrayList l;
    Stack(){
        l=new MyArrayList();
    }
    public void push(Object e){
        l.add(e);
    }
    public Object pop(){
        Object key=l.get(l.size()-1);
        l.remove(l.size()-1);
        return key ;
    }
    public Object peek(){
        return l.get(l.size()-1);
    }
    public int size(){
        return l.size();
    }
    public boolean isEmpty(){
        return size()==0;
    }
 
}
