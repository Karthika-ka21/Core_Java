public class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("main starts");
        try{
            System.out.println(10/0);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.err.println("inside last catch block");
        }
        System.out.println("main ends");
    }
}
