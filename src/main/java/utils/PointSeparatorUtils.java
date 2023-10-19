package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PointSeparatorUtils {

    /***
     * @desc 포인트문자열에서 포인트문자 추출하여 배열로 반환
     * @param pointStr
     * ex) (10,20)
     * @return String[] {x, y}
     */
    public static String[] splitPointString(String pointStr) {
        String regex = "[(](.*?),(.*?)[)]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pointStr);

        ValidationUtils.isValidInputPointString(matcher);

        String[] strings = new String[2];
        if (matcher.find()) {
            strings = new String[] {matcher.group(1), matcher.group(2)};
        }
        return strings;
    }
}
