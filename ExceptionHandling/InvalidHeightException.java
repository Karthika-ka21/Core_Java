public class InvalidHeightException extends Exception{
    private String message;
    InvalidHeightException(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}
