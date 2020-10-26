package Stack_Queue.Thuc_hanh.Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackWithLinkedlist<T> {
    private LinkedList<T> stack;

    public StackWithLinkedlist() {
        stack = new LinkedList();
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public void push(T element) {
        stack.addFirst(element);
    }
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    public int size() {
        return stack.size();
    }
    private static void stackOfIStrings() {
        StackWithLinkedlist<String> stack = new StackWithLinkedlist();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
    private static void stackOfIntegers() {
        StackWithLinkedlist<Integer> stack = new StackWithLinkedlist<Integer>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
