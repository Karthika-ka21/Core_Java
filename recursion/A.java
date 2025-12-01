 class A {
    static int i=1;
    static void display(int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        i++;
        display(n);
    }
    static void displayReverse(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        displayReverse(n-1);
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Displaying numbers from " + n + " to 1:");
        displayReverse(5);
        System.out.println();
        System.out.println("Displaying numbers from 1 to " + n + ":");
        display(5);
    }
    
}
