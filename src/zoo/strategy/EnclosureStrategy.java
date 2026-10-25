package zoo.strategy;

import zoo.EnclosureSize;

public interface EnclosureStrategy {
    int calculatePrice(EnclosureSize size);
}
