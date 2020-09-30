package Introduction_To_Java.Bai_Tap;

public class SNT100 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(i);
            }
        }

    }
}
