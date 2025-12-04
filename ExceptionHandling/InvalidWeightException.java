public class InvalidWeightException extends Exception{
    private String message;
    InvalidWeightException(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}
