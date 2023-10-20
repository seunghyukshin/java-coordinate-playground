package utils;

import java.util.regex.Matcher;

public class ValidationUtils {
    public static void isValidInputPointString(Matcher matcher) {
        if (matcher.groupCount() != 2) {
            throw new IllegalArgumentException("[입력값 오류] 입력값을 확인해주세요.");
        }

//        if (isNumber(matcher.group(1)) && isNumber(matcher.group(2))) {
//            throw new IllegalArgumentException("[입력값 오류] 좌표값은 숫자만 가능합니다.");
//        }
    }

    public static boolean isNumber(String input) {
        // TODO :
        return input.matches("(-)?\\d*\\.?(-)?\\d+");

    }
}
