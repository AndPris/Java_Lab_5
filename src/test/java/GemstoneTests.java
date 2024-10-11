import gemstones.Gemstone;
import gemstones.imp.Agate;
import gemstones.imp.Diamond;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GemstoneTests {
    @Test
    public void constructorTest1() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Agate(-2, 3, 0.5));
        assertEquals("Invalid weight", exception.getMessage());
    }

    @Test
    public void constructorTest2() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Agate(2, -3, 0.5));
        assertEquals("Invalid price", exception.getMessage());
    }

    @Test
    public void constructorTest3() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Agate(2, 3, -0.5));
        assertEquals("Invalid transparency", exception.getMessage());
    }

    @Test
    public void constructorTest4() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Agate(2, 3, 3));
        assertEquals("Invalid transparency", exception.getMessage());
    }

    @Test
    public void toStringTest1() {
        Gemstone gemstone = new Agate(2, 3, 0.5);
        assertEquals("Agate is a SemiPreciousGemstone with weight 2.0 carat, price 3.0$ and transparency 0.5.",
                        gemstone.toString());
    }

    @Test
    public void toStringTest2() {
        Gemstone gemstone = new Diamond(2, 3, 0.5);
        assertEquals("Diamond is a PreciousGemstone with weight 2.0 carat, price 3.0$ and transparency 0.5.",
                gemstone.toString());
    }
}
