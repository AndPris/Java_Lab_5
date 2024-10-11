import gemstones.Gemstone;
import gemstones.imp.Agate;
import gemstones.imp.Diamond;
import gemstones.imp.Emerald;
import gemstones.imp.Lazurite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NecklaceTests {
    private Necklace necklace;
    private Agate agate;
    private Diamond diamond;
    private Emerald emerald;
    private Lazurite lazurite;

    @BeforeEach
    public void setUp() {
        agate = new Agate(2, 2, 0.2);
        diamond = new Diamond(5, 5, 0.5);
        emerald = new Emerald(10, 8, 0.7);
        lazurite = new Lazurite(3, 12, 0.9);

        necklace = new Necklace();

        necklace.addGemstone(agate);
        necklace.addGemstone(diamond);
        necklace.addGemstone(emerald);
        necklace.addGemstone(lazurite);
    }

    @Test
    public void getTotalWeightTest() {
        assertEquals(20.0, necklace.getTotalWeight());
    }

    @Test
    public void getTotalPriceTest() {
        assertEquals(27, necklace.getTotalPrice());
    }

    @Test
    public void getGemstonesInTransparencyRangeTest() {
        List<Gemstone> expected = new ArrayList<>();
        expected.add(diamond);
        expected.add(emerald);

        List<Gemstone> actual = necklace.getGemstonesInTransparencyRange(0.4, 0.8);
        assertEquals(expected, actual);
    }
}
