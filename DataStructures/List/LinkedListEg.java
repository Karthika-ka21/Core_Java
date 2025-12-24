import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListEg {
    public static void main(String[] args) {
        
        MyLinkedList l=new MyLinkedList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        System.out.println(l.get(2));
        l.add(2,25);
        System.out.println(l);
        l.remove(4);
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        l.add(0,5);
        System.out.println(l);
        l.set(2,35);
        System.out.println(l);
        System.out.println(l.size());
        l.reverse();
       
        
        //LinkedList<String> l=new LinkedList<String>();
        // //l.add(5,"xyz"); OutOfBoundsException
        // //System.out.println(l);
        
        // l.add("abc");
        // l.add("xyz");
        // l.add("pqr");
        // l.add("karthika");
        // l.add("hi all");
        // ListIterator li=l.listIterator();
        // while(li.hasNext()){
        //     //System.out.println(li.previous()); NoSuchElementException
        //     System.out.println(li.next());
        //     //System.out.println(li.previous()); repeatedly print first element infinite times
        // }
        // System.out.println("---------------------");
        // while(li.hasPrevious()){
        //     System.out.println(li.previous());
        // }
    }
}
