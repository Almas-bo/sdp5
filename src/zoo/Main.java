package zoo;

import zoo.strategy.AquaticEnclosure;
import zoo.strategy.CaveEnclosure;
import zoo.strategy.StandardEnclosure;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(new StandardEnclosure(), EnclosureSize.SMALL);
        System.out.println("Standard, small: " + zoo.getPrice());

        zoo.setEnclosure(new AquaticEnclosure());
        System.out.println("Aquatic, small: " + zoo.getPrice());

        zoo.setEnclosure(new CaveEnclosure());
        System.out.println("Cave, small: " + zoo.getPrice());

        zoo.setSize(EnclosureSize.GIANT);
        System.out.println("Cave, giant: " + zoo.getPrice());
    }
}
