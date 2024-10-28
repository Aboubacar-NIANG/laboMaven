import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculTaxesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    public void montantNegatif(){
        assertThrows(IllegalArgumentException.class,
                ()-> CalculTaxes.calculerTaxes(-20, true, true));
    }

    @Test
    public void montantEstZero() {
        assertThrows(IllegalArgumentException.class,
                ()-> CalculTaxes.calculerTaxes(0, true, true));
    }

    @Test
    public void provincialTaxPresent() {
        assertEquals(110, CalculTaxes.calculerTaxes(100, false, true));
    }

    @Test
    public void federalTaxPresent() {
        assertEquals(105, CalculTaxes.calculerTaxes(100, true, false));
    }

    @Test
    public void provincialAndfederalTaxPresent () {
        assertEquals(115, CalculTaxes.calculerTaxes(100, true, true));
    }
}