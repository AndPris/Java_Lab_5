import gemstones.Gemstone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The <code>Necklace</code> class represents a collection of gemstones that can be added to form a necklace.
 * It provides methods to calculate the total weight and price of the gemstones, display the gemstones,
 * sort them by price, and filter gemstones based on transparency range.
 * @see Gemstone
 */
public class Necklace {

    /** The list of gemstones in the necklace. */
    private final List<Gemstone> gemstones;

    /**
     * Constructs an empty <code>Necklace</code> object.
     */
    public Necklace() {
        gemstones = new ArrayList<>();
    }

    /**
     * Adds a gemstone to the necklace.
     * @param gemstone the gemstone to be added to the necklace
     */
    public void addGemstone(Gemstone gemstone) {
        gemstones.add(gemstone);
    }

    /**
     * Calculates and returns the total weight of all gemstones in the necklace.
     * @return the total weight of gemstones in carats
     * @see Gemstone#getWeight()
     */
    public double getTotalWeight() {
        return gemstones.stream().mapToDouble(Gemstone::getWeight).sum();
    }

    /**
     * Calculates and returns the total price of all gemstones in the necklace.
     * @return the total price of gemstones in dollars
     * @see Gemstone#getPrice()
     */
    public double getTotalPrice() {
        return gemstones.stream().mapToDouble(Gemstone::getPrice).sum();
    }

    /**
     * Displays all the gemstones in the necklace by printing them to the console.
     */
    public void displayGemstones() {
        gemstones.forEach(System.out::println);
    }

    /**
     * Sorts the gemstones in the necklace by price in ascending order.
     */
    public void sortGemstonesByPrice() {
        gemstones.sort(Comparator.comparing(Gemstone::getPrice));
    }

    /**
     * Filters and returns a list of gemstones in the necklace that fall within the specified transparency range.
     * @param lowerBound the lower bound of the transparency range (inclusive)
     * @param upperBound the upper bound of the transparency range (inclusive)
     * @return a list of gemstones that match the specified transparency range
     * @see Gemstone#getTransparency()
     */
    public List<Gemstone> getGemstonesInTransparencyRange(double lowerBound, double upperBound) {
        return gemstones.stream()
                .filter(gemstone -> gemstone.getTransparency() >= lowerBound &&
                                    gemstone.getTransparency() <= upperBound)
                .collect(Collectors.toList());
    }
}
