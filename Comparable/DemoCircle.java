
import java.util.Arrays;
public class DemoCircle {
    public static void main(String[] args) {
        Circle[] a={
            new Circle(5),
            new Circle(40),
            new Circle(25),
            new Circle(50),
            new Circle(30)
        };
         for(Circle c:a){
            System.out.println(c);
        }
        Arrays.sort(a);
        System.out.println("After Sorting");
        for(Circle c:a){
            System.out.println(c);
        }
    }
}
