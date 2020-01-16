import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringcalculator {


    public int Add(String stringOfNums){

        int sum = 0;

        List<String> matchList = new ArrayList<>();

        try {
            Pattern regex = Pattern.compile("\\d+");
            Matcher regexMatcher = regex.matcher(stringOfNums);
            while (regexMatcher.find()) {
                matchList.add(regexMatcher.group());
            }

        }catch (Exception ignored){

        }finally {
            for (String num: matchList) {
                sum+=Integer.parseInt(num);
            }
        }
        return sum;
    }

    public int Add(){
        return 0;
    }
    public int Add(String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }


}
