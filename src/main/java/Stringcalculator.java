import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringcalculator {

    public int Add(String stringOfNums) throws Exception {
        int sum = 0;
        //
        if(stringOfNums.isEmpty()){
            return 0;
        }
        else if(stringOfNums.length()==2){
            String[] numbers = stringOfNums.split(",");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }else{
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
                throw new Exception("Doesn't accept negative numbers");
            }finally {
                for (String num: matchList) {
                    sum += Integer.parseInt(num);
                }
            }
            return sum;
        }
    }
    public int Add(){
        return 0;
    }

}
