package introduction_to_java.bai_tap;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.printf("Enter your name:");
        name = scanner.nextLine();

        System.out.printf("%s%s","Hello: ", name);
    }
}
