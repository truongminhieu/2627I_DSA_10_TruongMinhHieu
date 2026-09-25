import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int q = sc.nextInt();
        String s = "";
        Stack<String> states = new Stack<String>();
        for (int i = 1; i <= q; i++) {
            if (!sc.hasNextInt()) break;
            int type = sc.nextInt();
            if (type == 1) {
                states.push(s);
                String x = sc.next();
                s += x;
            } else if (type == 2) {
                states.push(s);
                int k = sc.nextInt();
                if (k == s.length()) s = "";
                else s = s.substring(0, s.length() - k);
            } else if (type == 3) {
                int k = sc.nextInt();
                System.out.println(s.charAt(k - 1));
            } else {
                s = states.pop();
            }
        }
        sc.close();
    }
}
