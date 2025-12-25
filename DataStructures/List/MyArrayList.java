
public class MyArrayList {
    private int p=0;
    private Object[] arr;
    MyArrayList(){
        arr=new Object[5];
    }
    MyArrayList(int size){
        arr=new Object[size];
    }
    public void add(Object e){
        if(p>=arr.length){
            increaseSize();
        }
        arr[p]=e;
        p++;
    }
    private void increaseSize(){
        Object[] temp=new Object[arr.length+5];
            for(int i=0;i<arr.length;i++){
                temp[i]=arr[i];
            }
            arr=temp;
    }
    public int size(){
        return p;
    }
    public Object get(int index){
        if(index<0 || index>=size()){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }
    public void add(int index,Object e){
        if(index<0 || index>=size()){
            throw new IndexOutOfBoundsException();
        }
         if(p>=arr.length){
            increaseSize();
        }
        for(int i=size()-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=e;
        p++;
    }
    public void remove(int index){
        if(index<0 || index>=size()){
            throw new IndexOutOfBoundsException();
        }
        for(int i=index+1;i<size();i++){
            arr[i-1]=arr[i];
        }
        p--;
        arr[p]=null;
    }

    @Override
    public String toString() {

        if(size()==0) return "[]";
       String s="["+arr[0];
       for(int i=1;i<size();i++){
        s+=","+arr[i];
       }
       s+="]";
       return s;
    }
    public void clear(){
        arr=new Object[5];
        p=0;
    }
}
