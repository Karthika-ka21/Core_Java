class Facebook{
    String userName="karthika";
    String password="karthi123";
    void login(String userName,String password){
        
        
        if(this.userName==userName){
            if(this.password==password){
                System.out.println("login successful");
            }else{
                try{
                    throw new InvalidPasswordException("Invalid Password");
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        else{
                try{
                    throw new InvalidUserNameException("Invalid Password");
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
        }
    }
}