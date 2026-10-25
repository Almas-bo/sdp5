package zoo;

/** Configuration of an enclosure: scales the final price, never changes how it is computed. */
public enum EnclosureSize {
    SMALL(1.0),
    MEDIUM(1.5),
    LARGE(2.5),
    GIGANTIC(4.0);

    private final double priceMultiplier;

    EnclosureSize(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public double priceMultiplier() {
        return priceMultiplier;
    }
}
