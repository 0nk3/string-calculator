import java.sql.Array;

public class Stringcalculator {


    public int Add(String num1) {
        int sum = 0;
        String[] numbersList = num1.split(",");

        if (num1.length() ==0) {
            return 0;
        } else {
            for (String number: numbersList) {
                sum += Integer.parseInt(number);
            }
            return sum;
        }
    }

    public int Add(){
        return 0;
    }
    public int Add(String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }


}
