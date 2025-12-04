public class InvalidUserNameException extends Exception{
    private String message;
    InvalidUserNameException(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}
