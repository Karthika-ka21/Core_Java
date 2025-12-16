import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class ArrayListEg{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the number of elements");
        // int n=sc.nextInt();
        // sc.nextLine();
        // System.out.println("Enter the elements");
        // ArrayList a=new ArrayList();
        // for(int i=0;i<n;i++){
        //     a.add(sc.nextLine());
        // }
        ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(5);
        b.add(10);
        b.add(15);
        b.add(20);
        b.add(25);
        b.add(4,30);
        b.set(2,3);
        System.out.println(b);
        // a.add('A');
        // System.out.println(a);
        // System.out.println(a.size());
        Iterator<Integer> itr=b.iterator();
        //b.add(7); ConcurrentModificationException
        while(itr.hasNext()){
            //itr.remove(); IllegalStateException
            System.out.println(itr.next());
            itr.remove();

        }
        System.out.println(itr.hasNext());
        // itr.next(); NoSuchElementException
        
        //System.out.println(a.get(a.size()-1) instanceof Character );
    }
}