package utils;

import java.util.regex.Matcher;

public class ValidationUtils {
    public static void isValidInputPointString(Matcher matcher) {
        if (matcher.groupCount() != 2) {
            throw new IllegalArgumentException("입력값을 확인해주세요.");
        }

//        if (isNumber(matcher.group(1)) && isNumber(matcher.group(2))) {
//            throw new IllegalArgumentException("좌표값으로 숫자를 입력해주세요.");
//        }
    }

    public static boolean isNumber(String input) {
        return input.matches("(-)?\\d*\\.?\\d+");

    }
}
