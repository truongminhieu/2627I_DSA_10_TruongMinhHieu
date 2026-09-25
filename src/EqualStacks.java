import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        int hei1 = 0; int hei2 = 0; int hei3 = 0;
        int i = 0; int j = 0; int k = 0;
        for (int num : h1) hei1 += num;
        for (int num : h2) hei2 += num;
        for (int num : h3) hei3 += num;
        while (hei1 != hei2 || hei2 != hei3) {
            int mn = Math.min(hei1, Math.min(hei2, hei3));
            while (hei1 > mn) {
                hei1 -= h1.get(i);
                i++;
            }
            while (hei2 > mn) {
                hei2 -= h2.get(j);
                j++;
            }
            while (hei3 > mn) {
                hei3 -= h3.get(k);
                k++;
            }
        }
        return hei1;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int n2 = sc.nextInt();

        int n3 = sc.nextInt();

        List<Integer> h1 = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            int h1Item = sc.nextInt();
            h1.add(h1Item);
        }

        List<Integer> h2 = new ArrayList<>();

        for (int i = 0; i < n2; i++) {
            int h2Item = sc.nextInt();
            h2.add(h2Item);
        }

        List<Integer> h3 = new ArrayList<>();

        for (int i = 0; i < n3; i++) {
            int h3Item = sc.nextInt();
            h3.add(h3Item);
        }

        System.out.print(equalStacks(h1, h2, h3));

        sc.close();
    }
}
