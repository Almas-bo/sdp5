package zoo.strategy;

import zoo.EnclosureSize;

public class AquaticEnclosure implements EnclosureStrategy {

    @Override
    public int calculatePrice(EnclosureSize size) {
        return 3000 * size.getMultiplier();
    }
}
