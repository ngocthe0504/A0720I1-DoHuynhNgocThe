package commons;

public class RegexSDT {
    private static String regexSDT = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
    public static boolean RegexSDT(String phoneNumber) {
        return regexSDT.matches(phoneNumber);
    }
}
