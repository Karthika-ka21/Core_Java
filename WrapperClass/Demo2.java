

public class Demo2 {
    public static void main(String[] args) {
        Integer i=5;
        int x=i; //auto unboxing
        System.out.println(x);
        System.out.println(i.intValue()*5); //unboxing
        System.out.println(i+5); //auto unboxing happens and then operation is performed
    }
}
