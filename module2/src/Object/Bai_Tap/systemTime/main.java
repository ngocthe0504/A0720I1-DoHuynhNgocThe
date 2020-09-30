package Object.Bai_Tap.systemTime;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000) + 1;
        }
        SystemTime systemTime = new SystemTime();
        systemTime.start();
        Arrays.sort(arr);
        systemTime.stop();
        System.out.print(systemTime.getElapsedTime());
    }
}
