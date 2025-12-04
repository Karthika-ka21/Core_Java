public class InvalidPasswordException extends Exception{
    private String message;
    InvalidPasswordException(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}
