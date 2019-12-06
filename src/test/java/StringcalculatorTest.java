import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringcalculatorTest {

    Stringcalculator stringcalculator = new Stringcalculator();

    @Test
    void  emptyStringTest(){
        assertEquals(0, stringcalculator.Add());
    }

}