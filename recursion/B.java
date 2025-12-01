 class B {
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
        int sumResult = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sumResult);
    }
    
}
