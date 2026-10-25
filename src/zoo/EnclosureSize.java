package zoo;

public enum EnclosureSize {
    SMALL(1),
    MEDIUM(2),
    LARGE(3),
    GIANT(5);

    private final int multiplier;

    EnclosureSize(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }
}
