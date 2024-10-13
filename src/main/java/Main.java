import gemstones.Gemstone;
import gemstones.imp.*;

/**
 * C13 = 18 % 13 = 5
 */

public class Main {
    public static void main(String[] args) {
        Gemstone[] gemstones = new Gemstone[6];
        gemstones[0] = new Agate(14, 10, 0.2);
        gemstones[1] = new Diamond(10, 40, 0.3);
        gemstones[2] = new Emerald(8, 30, 0.5);
        gemstones[3] = new Lazurite(20, 13, 0.1);
        gemstones[4] = new Opal(5, 8, 0.25);
        gemstones[5] = new Rubin(11, 35, 0.7);

        Necklace necklace = new Necklace(gemstones);

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
        Gemstone[] gemstones1 = necklace.getGemstonesInTransparencyRange(lowerBound, upperBound);
        System.out.println("Gemstones with transparency in range (" + lowerBound + "; " + upperBound + "):");
        for(Gemstone gemstone : gemstones1)
            System.out.println(gemstone);
    }
}
