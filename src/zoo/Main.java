package zoo;

import zoo.strategy.AquaticEnclosure;
import zoo.strategy.CaveEnclosure;
import zoo.strategy.StandardEnclosure;

/** Client: chooses strategies and size, and switches them while the program runs. */
public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(new StandardEnclosure(), EnclosureSize.SMALL);
        System.out.println(zoo.describe());

        zoo.setEnclosure(new AquaticEnclosure());
        System.out.println(zoo.describe());

        zoo.setEnclosure(new CaveEnclosure());
        System.out.println(zoo.describe());

        System.out.println("-- same cave, size changed (configuration, not strategy) --");
        for (EnclosureSize size : EnclosureSize.values()) {
            zoo.setSize(size);
            System.out.println(zoo.describe());
        }
    }
}
