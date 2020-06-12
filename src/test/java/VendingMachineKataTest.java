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
    public void getDisplayText_ShouldDisplay() {
        String expected = "INSERT COIN";

        String actual = subject.getDisplayText();

        assertEquals(expected, actual);
    }
}