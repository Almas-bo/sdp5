package zoo.strategy;

import zoo.EnclosureSize;

public class CaveEnclosure implements EnclosureStrategy {

    private static final double EXCAVATION = 12_000;
    private static final double ROCK_WALLS = 6_000;
    private static final double ARTIFICIAL_LIGHTING = 2_500;

    @Override
    public String name() {
        return "Cave";
    }

    @Override
    public double calculatePrice(EnclosureSize size) {
        return (EXCAVATION + ROCK_WALLS + ARTIFICIAL_LIGHTING) * size.priceMultiplier();
    }
}
