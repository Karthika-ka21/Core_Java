 import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: take input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n; // store original number
        int sum = 0;
        int count = 0;

        // Step 2: count the number of digits
        int t = n;
        while (t > 0) {
            count++;
            t = t / 10;
        }

        // Step 3: calculate sum of digits raised to the power 'count'
        t = n; // reset t to original number
        while (t > 0) {
            int digit = t % 10; // get last digit
            int power = 1;
            for (int i = 1; i <= count; i++) { // calculate digit^count
                power = power * digit;
            }
            sum += power;       // add to sum
            t = t / 10;         // remove last digit
        }

        // Step 4: check if sum equals original number
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}

    
    

