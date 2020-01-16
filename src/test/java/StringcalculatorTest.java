import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringcalculatorTest {

    Stringcalculator stringcalculator = new Stringcalculator();

    @Test
    void  emptyStringTest(){
        assertEquals(0, stringcalculator.Add(""));
    }
    @Test
    void  oneStringTest(){
        assertEquals(1, stringcalculator.Add("1"));
    }
    @Test
    void twoStringTest(){
        assertEquals(2, stringcalculator.Add("1", "1"));
    }
    @Test
    void multipleStringTest1(){
        assertEquals(10, stringcalculator.Add("1,2,3,4"));
    }@Test
    void multipleStringTest2(){
        assertEquals(10, stringcalculator.Add("1,2,3,4"));
    }
}