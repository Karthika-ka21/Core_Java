public class StackEg2 {
    public static void main(String[] args) {
        StackLL s=new StackLL();
        s.push('a');
        s.push('b');
        s.push('c');
        s.push('d');
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println(s.isEmpty());
    }
}
