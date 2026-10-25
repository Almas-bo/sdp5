package zoo.strategy;

import zoo.EnclosureSize;

/** Strategy: one way of keeping animals, and the price of building such an enclosure. */
public interface EnclosureStrategy {

    String name();

    double calculatePrice(EnclosureSize size);
}
