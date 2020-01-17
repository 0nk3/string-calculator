import java.util.ArrayList;

public class Stringcalculator {

    private static final int BIG_NUMBERS = 1000;
    //method to call if no argument has been provided
    public int Add(){
        return 0;
    }
    //method to be accessed by the tester
    public static int Add(String stringNumbers) throws Exception {

        String delimiter = ",\n";

        if (stringNumbers.startsWith("//")) {
            delimiter = stringNumbers.substring(stringNumbers.indexOf("//") + 2, stringNumbers.indexOf("\n"));

            String[] arrayOfNumbers = delimiter.split("[,]");

            for (String s : arrayOfNumbers) {
                delimiter = delimiter + s;
            }
            stringNumbers = stringNumbers.substring(stringNumbers.indexOf("\n"), stringNumbers.length());
        }
        delimiter = "[" + delimiter + "]";

        return Add(stringNumbers, delimiter);
    }

    //method only accessible withing this class, its just for splitting and removing delimiters
    private static int Add(final String numbers, String delimiter) throws Exception {
        int sum = 0;
        String[] arrayOfNumbers = numbers.split("[" + delimiter + "]");  // to store the actual numbers split by the delimiter found and its a list of characters put inside the square brackets
        ArrayList<Integer> negativeNumbers = new ArrayList<>();             // and array to store all the negative numbers if found

        for (String result : arrayOfNumbers) {
            if (!result.trim().isEmpty()) {
                int numberSignCheck = Integer.parseInt(result.trim());
                if (numberSignCheck < 0) {   // check if number is negative and add to the list of negatives
                    negativeNumbers.add(numberSignCheck);
                    throw new Exception("ERROR : Invalid input " + negativeNumbers.toString());
                } else if (numberSignCheck <= BIG_NUMBERS ) {
                    sum += numberSignCheck;
                }
            }
        }
        return sum;
    }

}
