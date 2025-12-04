public class Agniveer {
    void exam(double height,double weight) throws InvalidHeightException,InvalidWeightException{
        if(height>=6){
            if(weight>=70){
                System.out.println("Eligible for participate in Agniveer Exam");
            }
            else{
                throw new InvalidWeightException("criteria for weight is not satisfied");
            }
        }
        else{
            throw new InvalidHeightException("Criteria for height is not satisfied");
        }
        System.out.println("Thank you for the application");
    }
}
