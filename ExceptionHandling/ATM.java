public class ATM {
    int balance=5000;
    void withdraw(int amount){
        if(amount<=balance){
            System.out.println(amount+"withdrawn successfully");
        }else{
            try{
                throw new InsufficientBalanceException("Insufficient Balance");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
