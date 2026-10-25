package zoo.strategy;

import zoo.EnclosureSize;

public class AquaticEnclosure implements EnclosureStrategy {

    private static final double POOL_CONSTRUCTION = 15_000;
    private static final double WATER_FILTRATION = 8_000;
    private static final double WATER_HEATING = 3_000;

    @Override
    public String name() {
        return "Aquatic";
    }

    @Override
    public double calculatePrice(EnclosureSize size) {
        double equipment = WATER_FILTRATION + WATER_HEATING;
        return (POOL_CONSTRUCTION + equipment) * size.priceMultiplier();
    }
}
