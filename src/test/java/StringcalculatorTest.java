import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringcalculatorTest {

    private Stringcalculator stringcalculator = new Stringcalculator();

    @Test
    void testCaseForStringCalculator() throws Exception{

        //no argument passed
        assertEquals(0,stringcalculator.Add());

        //double quotation passed as argument
        assertEquals(0, Stringcalculator.Add(""));

        //Test for multiple numbers passed as string argument
        assertEquals(1, Stringcalculator.Add("1"));

        assertEquals(2, Stringcalculator.Add("1,1"));

        assertEquals(10, Stringcalculator.Add("1,2,3,4"));

        assertEquals(10, Stringcalculator.Add("1,2,3,4"));

        assertEquals(6, Stringcalculator.Add("1\n2,3"));

        assertEquals(3, Stringcalculator.Add("//;\n1;2"));

        assertEquals(3, Stringcalculator.Add("//4\n142"));
    }
    /* ***************************************************************************************** */
    @Test
    void stringCalcAddFailTest() throws Exception {
        Stringcalculator.Add("1,3,-4");
    }
}