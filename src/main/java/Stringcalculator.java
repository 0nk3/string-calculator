import java.util.ArrayList;
/* ************************************************************************************************* *
 * @author : Ndumiso Onke Fanti                                                                      *
 * Description : String Calculator takes input of numbers as a string with in various forms with     *
 * different delimiters and find the sum of those numbers extracted under given conditions           *
 *  1.Create an add function that can handle up to two integers passed in as a string                *
 *  2.Modify the add function to handle multiple integers                                            *
 *  3.Modify the add function so that it can handle new lines between integers                       *
 *  4.Modify the add function so that it can handle different delimiters                             *
 *  5.Modify the ass function so that it can handle negative integers.                                *
 *  6.Modify the add function so that it ignores integers greater than or equal to 1000              *
 *  7.Modify the add function so that it can support delimiters of any length                        *
 *  8.Modify the add function so that it is able to support different delimiters of any length       *
 *  9.Modify the add function so that it can handle invalid input                                    *
 * ************************************************************************************************* */
public class Stringcalculator {
    // Constant to use when ignoring numbers greater than 1000
    private static final int BIGNUMBERS = 1_000;

    //method to be accessed by the tester
    public static int Add(String stringNumbers) throws Exception {
        StringBuilder DELIMETER = new StringBuilder(",\n");

        if (stringNumbers.startsWith("//")) {
            DELIMETER = new StringBuilder(stringNumbers.substring(stringNumbers.indexOf("//") + 2, stringNumbers.indexOf("\n")));
            String[] arrayOfNumbers = DELIMETER.toString().split("[,]");

            for (String s : arrayOfNumbers) {
                DELIMETER.append(s);
            }
            stringNumbers = stringNumbers.substring(stringNumbers.indexOf("\n"));
        }
        DELIMETER = new StringBuilder("[" + DELIMETER + "]");

        return Add(stringNumbers, DELIMETER.toString());
    }

    //method only accessible withing this class, its just for splitting and accessing custom delimiters
    private static int Add(final String numbers, String delimiter) throws Exception {
        int sum = 0;

        // to store the actual numbers split by the delimiter found and its a list of characters put inside the square brackets
        String[] arrayOfNumbers = numbers.split("[" + delimiter + "]");

        // an array to store all the negative numbers if found
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        try {

            for (String result : arrayOfNumbers) {
                if (!result.trim().isEmpty()) {
                    int numberSignCheck = Integer.parseInt(result.trim());
                    // check if number is negative and add to the array list of of negative numbers
                    if (numberSignCheck < 0) {
                        negativeNumbers.add(numberSignCheck);
                    } else if (numberSignCheck < BIGNUMBERS) {
                        sum += numberSignCheck;
                    }
                }
            }
        }catch (NumberFormatException e){
            System.err.println("Invalid Input");
            throw new Exception("");
        }
        // checking if there are negative numbers found in the input to throw the number format exception if they are found
        // Also print out the actual negative numbers found in the specified format
        if(negativeNumbers.size()>1){
            StringBuilder negatives = new StringBuilder();

            for (int i = 0 ; i < negativeNumbers.size()-1;i++) {
                negatives.append(negativeNumbers.get(i)).append(", ");
            }
            negatives.append(negativeNumbers.get(negativeNumbers.size() - 1));
            System.err.println( "Error : Negatives not allowed " + negatives);
            throw new Exception("");
        }
        return sum;
    }
}
