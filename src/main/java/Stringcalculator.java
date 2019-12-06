public class Stringcalculator {

    public int Add(String ... numbers) {
        int sum = 0;

        for(int i = 0; i < numbers.length; i++)
            sum+=Integer.parseInt(numbers[i]);
    return sum;
    }

    public int Add(String num1) {
        if (num1.equals(" ")) {
            return 0;
        } else {
            return Integer.parseInt(num1);
        }
    }
    public int Add(String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }


}
