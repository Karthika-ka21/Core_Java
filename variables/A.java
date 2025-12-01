class A {
    int i;
    static int j;
    public static void main(String[] args) {
        int i=5;
        System.out.println(i);
        System.out.println(A.j);
        A a1=new A();
        System.out.println(a1.i);
    }
    
}
