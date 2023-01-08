import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;
public class Design {
    public static void main(String args[]) {
        Stack<String> str = new Stack<String>();
        boolean result = str.empty();
        Scanner sr = new Scanner(System.in);
        boolean a = true;
        while(a) {
            System.out.println("enter the searched data");
            String name = sr.nextLine();
            str.push(name);
            if (str.size() == 5) {
                a = false;
            }
        }
        System.out.println("enter the most visited websites");
        System.out.println(str.pop());
    }
}
