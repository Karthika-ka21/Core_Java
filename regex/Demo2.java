import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //Pattern p = Pattern.compile("[a-z]"); matches any 1 char between specific range
        //Pattern p = Pattern.compile("a+"); matches 1 or more occurance of prev char ie a
        //Pattern p = Pattern.compile("[a-c]+");
        //Pattern p = Pattern.compile("[a-n]*");
        //Pattern p = Pattern.compile("[a-c]{2}"); matches exactly 2 occurance of prev char
        Pattern p = Pattern.compile("[a-c]?");
        Matcher m = p.matcher("bnaccna");
        while (m.find()) {
            System.out.println(m.group());
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println("--------------");
        }
    }
}
