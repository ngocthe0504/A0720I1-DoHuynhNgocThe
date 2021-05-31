package Array_Method.Bai_Tap;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Nhap phan tu muon xoa: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                for (int j = i; j < arr.length-1 ; j++) {
                    arr[j] = arr[j+1];
                }
            }
        }
        arr[arr.length-1] = 0;
        System.out.println("mang sau khi xoa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
