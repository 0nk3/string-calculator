public class Stringcalculator {

    public int Add() {
        return 0;
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
