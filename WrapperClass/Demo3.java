public class Demo3 {
    public static void main(String[] args) {
        Object o=5;//Integer(5) is stored in o
        System.out.println(o); //toString() is overriden in wrapper class,
                              //due to latebinding toString() in child class(Integer) is executed
        Integer i1=10;
        Integer i2=10;
        System.out.println(i1==i2);  //true
        System.out.println(i1.equals(i2)); //true,equals() also overriden inwrapper class

        Integer a=200;
        Integer b=200;
        System.out.println(a==b);  //false
        System.out.println(a.equals(b)); //true

        Float f1=2.0f;
        Float f2=2.0f;
        System.out.println(f1==f2); //false
        System.out.println(f1.equals(f2)); //true
    }
    
}
