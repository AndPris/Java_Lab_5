package gemstones;

public abstract class Gemstone {
    protected double weight;
    protected double price;
    protected double transparency;

    public Gemstone(double weight, double price, double transparency) {
        setWeight(weight);
        setPrice(price);
        setTransparency(transparency);
    }

    public void setWeight(double weight) {
        if(weight < 0)
            throw new IllegalArgumentException("Invalid weight");
        this.weight = weight;
    }

    public void setPrice(double price) {
        if(price < 0)
            throw new IllegalArgumentException("Invalid price");
        this.price = price;
    }

    public void setTransparency(double transparency) {
        if(transparency < 0 || transparency > 1)
            throw new IllegalArgumentException("Invalid transparency");
        this.transparency = transparency;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getTransparency() {
        return transparency;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " is a " + this.getClass().getSuperclass().getSimpleName()
                + " with weight " + weight + " carat, price " + price + "$ and transparency " + transparency + ".";
    }
}
