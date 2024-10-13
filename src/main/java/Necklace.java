import gemstones.Gemstone;

import java.util.Arrays;
import java.util.Comparator;

/**
 * The <code>Necklace</code> class represents a collection of gemstones that can be added to form a necklace.
 * It provides methods to calculate the total weight and price of the gemstones, display the gemstones,
 * sort them by price, and filter gemstones based on transparency range.
 * @see Gemstone
 */
public class Necklace {

    /** The array of gemstones in the necklace. */
    private final Gemstone[] gemstones;

    /**
     * Constructs an empty <code>Necklace</code> object.
     */
    public Necklace(Gemstone[] gemstones) {
        this.gemstones = gemstones;
    }

    /**
     * Calculates and returns the total weight of all gemstones in the necklace.
     * @return the total weight of gemstones in carats
     * @see Gemstone#getWeight()
     */
    public double getTotalWeight() {
        double totalWeight = 0;
        for (Gemstone gemstone : gemstones)
            totalWeight += gemstone.getWeight();
        return totalWeight;
    }

    /**
     * Calculates and returns the total price of all gemstones in the necklace.
     * @return the total price of gemstones in dollars
     * @see Gemstone#getPrice()
     */
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Gemstone gemstone : gemstones)
            totalPrice += gemstone.getPrice();
        return totalPrice;
    }

    /**
     * Displays all the gemstones in the necklace by printing them to the console.
     */
    public void displayGemstones() {
        for(Gemstone gemstone : gemstones)
            System.out.println(gemstone);
    }

    /**
     * Sorts the gemstones in the necklace by price in ascending order.
     */
    public void sortGemstonesByPrice() {
        Arrays.sort(gemstones, Comparator.comparing(Gemstone::getPrice));
    }

    /**
     * Filters and returns an array of gemstones in the necklace that fall within the specified transparency range.
     * @param lowerBound the lower bound of the transparency range (inclusive)
     * @param upperBound the upper bound of the transparency range (inclusive)
     * @return an array of gemstones that match the specified transparency range
     * @see Gemstone#getTransparency()
     */
    public Gemstone[] getGemstonesInTransparencyRange(double lowerBound, double upperBound) {
        Gemstone[] gemstonesToReturn = new Gemstone[countAmountOfGemstonesInTransparencyRange(lowerBound, upperBound)];
        int index = 0;
        for (Gemstone gemstone : gemstones) {
            if(gemstone.getTransparency() >= lowerBound && gemstone.getTransparency() <= upperBound) {
                gemstonesToReturn[index++] = gemstone;
            }
        }
        return gemstonesToReturn;
    }

    private int countAmountOfGemstonesInTransparencyRange(double lowerBound, double upperBound) {
        int amountOfGemstones = 0;
        for (Gemstone gemstone : gemstones) {
            if(gemstone.getTransparency() >= lowerBound && gemstone.getTransparency() <= upperBound)
                ++amountOfGemstones;
        }
        return amountOfGemstones;
    }
}
