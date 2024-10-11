import gemstones.Gemstone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Necklace {
    private final List<Gemstone> gemstones;

    public Necklace() {
        gemstones = new ArrayList<>();
    }

    public void addGemstone(Gemstone gemstone) {
        gemstones.add(gemstone);
    }

    public double getTotalWeight() {
        return gemstones.stream().mapToDouble(Gemstone::getWeight).sum();
    }

    public double getTotalPrice() {
        return gemstones.stream().mapToDouble(Gemstone::getPrice).sum();
    }

    public void displayGemstones() {
        gemstones.forEach(System.out::println);
    }

    public void sortGemstonesByPrice() {
        gemstones.sort(Comparator.comparing(Gemstone::getPrice));
    }

    public List<Gemstone> getGemstonesInTransparencyRange(double lowerBound, double upperBound) {
        return gemstones.stream().filter(gemstone -> gemstone.getTransparency() >= lowerBound &&
                                                    gemstone.getTransparency() <= upperBound)
                .collect(Collectors.toList());
    }
}
