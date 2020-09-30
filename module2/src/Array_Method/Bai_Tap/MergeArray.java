package Array_Method.Bai_Tap;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1, arr2, arr3;
        int size1, size2, j = 0, k = 0;
        System.out.println("Nhap do dai mang thu 1 va mang thu 2: ");
        size1 = scanner.nextInt();
        size2 = scanner.nextInt();
        arr1 = new int[size1];
        arr2 = new int[size2];
        arr3 = new int[size1 + size2];
        while (j < arr1.length) {
            System.out.print("Nhap phan tu thu " + (j + 1) + " cua mang 1 :");
            arr1[j] = scanner.nextInt();
            j++;
        }
        while (k < arr2.length) {
            System.out.print("Nhap phan tu thu " + (k + 1) + " cua mang 2 :");
            arr2[k] = scanner.nextInt();
            k++;
        }
            

        for (int i = 0; i < arr3.length; i++) {
            if(i >= size1){
                arr3[i] = arr2[i - size1];
            } else {
                arr3[i] = arr1[i];
            }

        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
