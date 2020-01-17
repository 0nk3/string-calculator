import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringcalculator {
    public int Add(String stringOfNums){
        int sum = 0;
        //data extracted using regex will be stored on this array list
        ArrayList<String> matchList = new ArrayList<>();

        try {

//            Pattern patternDel = Pattern.compile("^(\\/\\/\\d+)");
//            Matcher DelMatcher = patternDel.matcher(stringOfNums);
//            stringOfNums = stringOfNums.replaceAll(String.valueOf(DelMatcher),"\\");

            final Pattern pattern = Pattern.compile("\\d+");
            final Matcher regexMatcher = pattern.matcher(stringOfNums);

            while (regexMatcher.find()) {
                matchList.add(regexMatcher.group());
            }

        }catch (Exception e){
                e.printStackTrace();
        }finally {
            for (String num: matchList) {
                sum += Integer.parseInt(num);
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
