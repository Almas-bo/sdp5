package zoo;

import zoo.strategy.EnclosureStrategy;

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

    public int getPrice() {
        return enclosure.calculatePrice(size);
    }
}
