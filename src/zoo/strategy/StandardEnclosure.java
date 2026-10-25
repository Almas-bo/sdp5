package zoo.strategy;

import zoo.EnclosureSize;

public class StandardEnclosure implements EnclosureStrategy {

    @Override
    public int calculatePrice(EnclosureSize size) {
        return 1000 * size.getMultiplier();
    }
}
