import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class RegexDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the pattern you want to check");
        String input=sc.nextLine();
        System.out.println("enter the String to verify the pattern");
        String str=sc.nextLine();
        Pattern p=Pattern.compile(input);
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
            System.out.println("---------------");
        }
    }
}
