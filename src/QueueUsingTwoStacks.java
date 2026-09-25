import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

    static class MyQueue {
        Stack<Integer> in = new Stack<Integer>();
        Stack<Integer> out = new Stack<Integer>();

        public void transfer() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }
        }

        public void enqueue(int x) {
            in.push(x);
        }

        public void dequeue() {
            transfer();
            if (!out.isEmpty()) {
                out.pop();
            }
        }

        public int peek() {
            transfer();
            return out.peek();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int q = sc.nextInt();

        MyQueue queue = new MyQueue();

        for (int i = 0; i < q; i++) {
            if (!sc.hasNextInt()) break;
            int type = sc.nextInt();

            if (type == 1) {
                int x = sc.nextInt();
                queue.enqueue(x);
            } else if (type == 2) {
                queue.dequeue();
            } else if (type == 3) {
                System.out.println(queue.peek());
            }
        }

        sc.close();
    }
}
