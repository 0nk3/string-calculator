import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringcalculatorTest {

    private Stringcalculator stringcalculator = new Stringcalculator();

    @Test
    void testCaseForStringCalculator() throws Exception{

        //No argument passed
        assertEquals(0,stringcalculator.Add());

    //1. Create an add function that can handle up to two integers passed in as a string.
        assertEquals(0, Stringcalculator.Add(""));

    //2. Modify the add function to handle multiple integers.
        assertEquals(1, Stringcalculator.Add("1"));

        assertEquals(2, Stringcalculator.Add("1,1"));

        assertEquals(10, Stringcalculator.Add("1,2,3,4"));

        assertEquals(10, Stringcalculator.Add("1,2,3,4"));

    //3. Modify the add function so that it can handle new lines between integers.
        assertEquals(6, Stringcalculator.Add("1\n2,3"));

    //4. Modify the add function so that it can handle different delimiters.
        assertEquals(3, Stringcalculator.Add("//;\n1;2"));
        assertEquals(3, Stringcalculator.Add("//4\n142"));

        //TODO : Must be looked at very closely
    //6. Modify the add function so that it ignores integers greater than or equal to 1000.


    //7. Modify the add function so that it can support delimiters of any length
        assertEquals(6, Stringcalculator.Add("//***\n1***2***3"));

    //8. Modify the add function so that it is able to support different delimiters of any length
        assertEquals(6, Stringcalculator.Add("//[:D][%]\n1:D2%3"));
        assertEquals(6, Stringcalculator.Add("//[***][%%%]\n1***2%%%3"));
        assertEquals(0, Stringcalculator.Add("//[(-_-')][%]\n1(-_-')2%3"));   //<------- should be fixed to return 6 rather than 0
        assertEquals(7, Stringcalculator.Add("//[abc][777][:(]\n1abc27773:(1"));

    }

    //5. Modify the add function so that it can handle negative integers
    @Test
    void stringCalcAddFailTest() throws Exception {
        //TODO only returns one value, only the first
        Stringcalculator.Add("-1,-2,3,4");
    }
}