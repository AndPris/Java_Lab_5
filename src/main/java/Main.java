import gemstones.Gemstone;
import gemstones.imp.*;

import java.util.List;

/**
 * C13 = 18 % 13 = 5
 */

public class Main {
    public static void main(String[] args) {
        Necklace necklace = new Necklace();
        necklace.addGemstone(new Agate(14, 10, 0.2));
        necklace.addGemstone(new Diamond(10, 40, 0.3));
        necklace.addGemstone(new Emerald(8, 30, 0.5));
        necklace.addGemstone(new Lazurite(20, 13, 0.1));
        necklace.addGemstone(new Opal(5, 8, 0.25));
        necklace.addGemstone(new Rubin(11, 35, 0.7));

        System.out.println("Gemstones in necklace:");
        necklace.displayGemstones();
        System.out.println("\n==========================================================\n");

        System.out.println("Total weight of necklace: " + necklace.getTotalWeight() + " carat.");
        System.out.println("Total price of necklace: " + necklace.getTotalPrice() + "$.");
        System.out.println("\n==========================================================\n");

        necklace.sortGemstonesByPrice();
        System.out.println("Gemstones sorted by price in necklace:");
        necklace.displayGemstones();
        System.out.println("\n==========================================================\n");

        double lowerBound = 0.25;
        double upperBound = 0.6;
        List<Gemstone> gemstones = necklace.getGemstonesInTransparencyRange(lowerBound, upperBound);
        System.out.println("Gemstones with transparency in range (" + lowerBound + "; " + upperBound + "):");
        gemstones.forEach(System.out::println);
    }
}
