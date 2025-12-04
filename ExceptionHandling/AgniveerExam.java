public class AgniveerExam {
    public static void main(String[] args) {
        Agniveer a=new Agniveer();
        try{
            a.exam(5.0,75.0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
}
