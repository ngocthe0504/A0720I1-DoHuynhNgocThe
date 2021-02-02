package commons;

import java.util.regex.Pattern;

public class RegexSDT {
    private static String regexEmail = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
    public static boolean RegexEmail(String phoneNumber) {
        return regexEmail.matches(phoneNumber);
    }
}
