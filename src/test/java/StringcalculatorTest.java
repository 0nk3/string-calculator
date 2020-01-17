import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringcalculatorTest {

    private Stringcalculator stringcalculator = new Stringcalculator();

    //no argument passed
    @Test
    void testNoArgument(){
        assertEquals(0,stringcalculator.Add());
    }
    /* ***************************************************************************************** */
    //double quotation passed as argument
    @Test
    void  emptyStringTest(){
        assertEquals(0, stringcalculator.Add(""));
    }
    //Test for multiple numbers passed as string argument
    @Test
    void  oneStringTest(){
        assertEquals(1, stringcalculator.Add("1"));
    }

    @Test
    void twoStringTest(){
        assertEquals(2, stringcalculator.Add("1,1"));
    }
    @Test
    void multipleStringTest1(){
        assertEquals(10, stringcalculator.Add("1,2,3,4"));
    }
    @Test
    void multipleStringTest2(){
        assertEquals(10, stringcalculator.Add("1,2,3,4"));

    }
    /* ******************************************************************************************* */
    // handling newlines test
    @Test
    void testNewlines(){
        assertEquals(6,stringcalculator.Add("1\n2,3"));
    }
    /* ******************************************************************************************* */
    // Handling different delimiters
    @Test
    void multipleStringTestWithDelimiters(){
        assertEquals(3, stringcalculator.Add("//;\n1;2"));
    }
    //TODO : Needs to be fixed (stuck)
    @Test
    void multipleStringTestWithDelimiters2(){
        assertEquals(146, stringcalculator.Add("//4\n142"));
    }
}