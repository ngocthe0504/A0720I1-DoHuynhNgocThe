package Stack_Queue.Bai_tap.Reverse;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Character> myStack = new Stack();

        for (int index = 0; index < str.length(); index++) {
            myStack.push(str.charAt(index));
        }

        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }
}
