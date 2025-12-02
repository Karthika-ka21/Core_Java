
import java.util.Arrays;
public class DemoBook {
    public static void main(String[] args){
        Book[] a={
            new Book("Wings Of Fire"," A P J Abdhul Kalam", 254.9),
            new Book("Harry Potter","J K Rowling", 451),
            new Book("Hamlet","William Shakesphere",500),
        };
         for(Book c:a){
            System.out.println(c);
        }
        Arrays.sort(a);
        System.out.println("After Sorting");
        for(Book c:a){
            System.out.println(c);
        }
    }
}
