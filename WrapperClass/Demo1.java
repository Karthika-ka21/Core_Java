import javax.print.attribute.IntegerSyntax;

public class Demo1 {
    public static void main(String[] args) {
        int i=10;
        Integer b=new Integer(i); //modern version of java don't recommend this
        Integer c=Integer.valueOf(i);
         System.out.println("c="+c);
        System.out.println("b="+b);
        Integer a=i; //auto boxing
        System.out.println(a);
        
    }
}
