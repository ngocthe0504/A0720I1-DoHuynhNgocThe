package Introduction_to_Java.Bai_Tap;
import java.util.Scanner;

class currency {
    public static void main(String[] args) {
        int USD, VND;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Nhập số tiền USD bạn muốn đổi: ");
            USD = scanner.nextInt();
        } while (USD < 0);
        VND = USD * 23000;
        System.out.printf("%s%s","Số tiền VND bạn đổi được là:", VND);
    }
}
