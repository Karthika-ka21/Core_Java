public class TryCatch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(("main starts"));
        try{
            System.out.println("inside try befor exception");
            System.out.println(a[10]);
            System.out.println("inside try after exception");
        }
        catch(Exception e){
            System.out.println(e.getMessage()); //Index 10 out of bounds for length 5
            e.printStackTrace(); /*java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5   
        at TryCatch.main(TryCatch.java:7) */
        }
        System.out.println("main ends");
        
    }
}
