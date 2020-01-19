import java.util.ArrayList;

public class Stringcalculator {

    private static final int BIG_NUMBERS = 1000;
    //method to call if no argument has been provided
    public int Add(){
        return 0;
    }
    //method to be accessed by the tester
    static int Add(String stringNumbers) throws Exception {
        StringBuilder delimiter = new StringBuilder(",\n");

        if (stringNumbers.startsWith("//")) {
            delimiter = new StringBuilder(stringNumbers.substring(stringNumbers.indexOf("//") + 2, stringNumbers.indexOf("\n")));
            String[] arrayOfNumbers = delimiter.toString().split("[,]");

            for (String s : arrayOfNumbers) {
                delimiter.append(s);
            }
            stringNumbers = stringNumbers.substring(stringNumbers.indexOf("\n"));
        }
        delimiter = new StringBuilder("[" + delimiter + "]");

        return Add(stringNumbers, delimiter.toString());
    }

    //method only accessible withing this class, its just for splitting and accessing custom delimiters
    private static int Add(final String numbers, String delimiter) throws Exception {
        int sum = 0;
        String[] arrayOfNumbers = numbers.split("[" + delimiter + "]");  // to store the actual numbers split by the delimiter found and its a list of characters put inside the square brackets

        ArrayList<Integer> negativeNumbers = new ArrayList<>();             // an array to store all the negative numbers if found

        for (String result : arrayOfNumbers) {
            if (!result.trim().isEmpty()) {
                int numberSignCheck = Integer.parseInt(result.trim());

                if (numberSignCheck < 0) {   // check if number is negative and add to the list of negatives
                    negativeNumbers.add(numberSignCheck);
                    //throw new Exception("ERROR : Invalid input " + negativeNumbers);
                } else if (numberSignCheck <= BIG_NUMBERS ) {
                    sum += numberSignCheck;
                }
            }
        }
        // checking if ther are negative numbers found in the input to throw the number format exception if they are found
        // Also print out the actual negative numbers found in the specified format
        if(negativeNumbers.size()>1){

            StringBuilder negatives = new StringBuilder();
            for (int i = 0 ; i < negativeNumbers.size()-1;i++) {
                negatives.append(negativeNumbers.get(i)).append(", ");

            }
            negatives.append(negativeNumbers.get(negativeNumbers.size() - 1));
            throw new NumberFormatException("Error : Negatives not Allowed " + negatives);
        }
        return sum;
    }

}
