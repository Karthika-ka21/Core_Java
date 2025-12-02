import java.util.Arrays;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee[] a={
            new Employee(001,"Riya",25000),
            new Employee(012,"Kavya",12500),
            new Employee(101,"Arun",20000),
            new Employee(120,"Surya",15000)
        };
          for(Employee c:a){
            System.out.println(c);
        }
        Arrays.sort(a);
        System.out.println("After Sorting");
        for(Employee c:a){
            System.out.println(c);
        }
    }
}
