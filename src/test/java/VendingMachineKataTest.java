import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineKataTest {
    private VendingMachineKata subject;

    @Before
    public void setup() {
        subject = new VendingMachineKata();
    }

    @Test
    public void getDisplayText_ShouldDisplayInsertCoin_WhenNothingIsInserted() {
        String expected = "INSERT COIN";

        String actual = subject.getDisplayText();

        assertEquals(expected, actual);
    }

    @Test
    public void getDisplayText_ShouldDisplayCoinValue_WhenSingleCoinInserted() {
        String expected = "0.05";

        subject.insertCoin("NICKEL");
        String actual = subject.getDisplayText();

        assertEquals(expected, actual);
    }

    @Test
    public void getDisplayText_ShouldDisplayCoinValue_WhenInvalidCoinInserted() {
        String expected = "INSERT COIN";

        subject.insertCoin("PENNY");
        String actual = subject.getDisplayText();

        assertEquals(expected, actual);
    }
}