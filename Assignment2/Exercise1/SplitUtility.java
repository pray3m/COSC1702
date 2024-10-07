import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitUtility {
    public static String[] split(String s, String regex) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int lastEnd = 0;

        while (matcher.find()) {
            if (matcher.start() > lastEnd) {

                result.add(s.substring(lastEnd, matcher.start()));
            }

            result.add(matcher.group());
            lastEnd = matcher.end();
        }

        if (lastEnd < s.length()) {
            result.add(s.substring(lastEnd));
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] result1 = split("ab#12#453", "#");
        System.out.println("Result of split(\"ab#12#453\", \"#\"):");
        for (String str : result1) {
            System.out.println(str);
        }

        System.out.println();

        String[] result2 = split("a?b?gf#e", "[?#]");
        System.out.println("Result of split(\"a?b?gf#e\", \"[?#]\"):");
        for (String str : result2) {
            System.out.println(str);
        }
    }
}
