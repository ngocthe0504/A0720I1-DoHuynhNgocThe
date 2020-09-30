package Introduction_To_Java.Bai_Tap;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter your name:");
        name = scanner.nextLine();

        System.out.printf("%s%s","Hello: ", name);
    }
}
