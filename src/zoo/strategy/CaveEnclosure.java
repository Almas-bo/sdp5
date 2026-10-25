package zoo.strategy;

import zoo.EnclosureSize;

public class CaveEnclosure implements EnclosureStrategy {

    @Override
    public int calculatePrice(EnclosureSize size) {
        return 2000 * size.getMultiplier();
    }
}
