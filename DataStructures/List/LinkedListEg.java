import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListEg {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<String>();
        
        //l.add(5,"xyz"); OutOfBoundsException
        //System.out.println(l);
        
        l.add("abc");
        l.add("xyz");
        l.add("pqr");
        l.add("karthika");
        l.add("hi all");
        ListIterator li=l.listIterator();
        while(li.hasNext()){
            //System.out.println(li.previous()); NoSuchElementException
            System.out.println(li.next());
            //System.out.println(li.previous()); repeatedly print first element infinite times
        }
        System.out.println("---------------------");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
