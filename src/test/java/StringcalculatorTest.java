import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringcalculatorTest {

    Stringcalculator stringcalculator = new Stringcalculator();

    @Test
    void  emptyStringTest(){
        assertEquals(0, stringcalculator.Add());
    }
    @Test
    void  oneStringTest(){
        assertEquals(1, stringcalculator.Add("1"));
    }
    @Test
    void twoStringTest(){
        assertEquals(3, stringcalculator.Add("1", "2"));
    }
}