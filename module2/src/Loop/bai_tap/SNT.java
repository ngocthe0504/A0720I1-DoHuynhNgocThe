package Loop.bai_tap;

public class SNT {
    int numberCheck = 0, display = 20;
    public static boolean check(int n) {
        if (n <= 1 ) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0, chekNumber = 0;
        String temp = "";
        while (count < 20) {
            if (check(chekNumber)) {
                temp += chekNumber + "\n";
                count++;
            }
            chekNumber++;
        }
        System.out.print(temp);
    }

}
