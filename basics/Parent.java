class Parent{
    {
    int i=10;
     m1();
    System.out.println("PIB");
    }
    Parent(){
        System.out.println("con");
    }
    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println("P main");
    }
    void m1(){
        System.out.println(j);
    }
    int j=20;
}
class Child extends Parent{
    int x=100;
    {
        m2();
        System.out.println("cfib");
    }
    Child(){
        System.out.println("child cons");
    }
    public static void main(String[] args) {
        Child c=new Child();
        System.out.println("child main");
    }
    public void m2(){
        System.out.println(y);
    }
    {
        System.out.println("csib");
    }
    int y=200;
}