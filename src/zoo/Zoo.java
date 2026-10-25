package zoo;

import zoo.strategy.EnclosureStrategy;

/** Context: knows only the EnclosureStrategy interface, never how a price is calculated. */
public class Zoo {

    private EnclosureStrategy enclosure;
    private EnclosureSize size;

    public Zoo(EnclosureStrategy enclosure, EnclosureSize size) {
        this.enclosure = enclosure;
        this.size = size;
    }

    public void setEnclosure(EnclosureStrategy enclosure) {
        this.enclosure = enclosure;
    }

    public void setSize(EnclosureSize size) {
        this.size = size;
    }

    public double enclosurePrice() {
        return enclosure.calculatePrice(size);
    }

    public String describe() {
        return String.format("%s enclosure, %s: %,.2f", enclosure.name(), size, enclosurePrice());
    }
}
