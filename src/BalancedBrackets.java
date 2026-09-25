import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> bra = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                bra.push(s.charAt(i));
            } else {
                if (bra.isEmpty()) return "NO";
                if (s.charAt(i) == '}') {
                    if (bra.peek() == '{') bra.pop();
                    else return "NO";
                } else if (s.charAt(i) == ']') {
                    if (bra.peek() == '[') bra.pop();
                    else return "NO";
                }  else {
                    if (bra.peek() == '(') bra.pop();
                    else return "NO";
                }
            }
        }
        if (!bra.isEmpty()) return "NO";
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            System.out.println(isBalanced(s));
        }
        sc.close();
    }
}
