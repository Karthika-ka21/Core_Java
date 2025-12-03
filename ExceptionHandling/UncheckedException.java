public class UncheckedException {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        // System.out.println(a[10]); ArrayIndexOutOfBoundException
        // System.out.println(10/0); ArithmeticException
        String str = "abcd";
        // System.out.println(str.charAt(5)); StringIndexOutOfBoundsException
        UncheckedException x = new A();
        // B y=(B)x; ClassCastException, class A cannot be cast to class B (A and B are
        // in unnamed module of loader 'app')
        // at UncheckedException.main(UncheckedException.java:9)
        String s1 = null;
        // System.out.println(s1.length()); NullPointerException
        // System.out.println(s1.charAt(0)); NullPointerException

    }
}

class A extends UncheckedException {

}

class B extends UncheckedException {

}
