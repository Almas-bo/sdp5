package zoo.strategy;

import zoo.EnclosureSize;

public class StandardEnclosure implements EnclosureStrategy {

    private static final double FENCING_AND_GROUND = 10_000;
    private static final double SHELTER = 2_000;

    @Override
    public String name() {
        return "Standard";
    }

    @Override
    public double calculatePrice(EnclosureSize size) {
        return (FENCING_AND_GROUND + SHELTER) * size.priceMultiplier();
    }
}
