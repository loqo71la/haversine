package dev.loqo71la.haversine;

public enum Unit {
    Kilometers(6371),
    Meters(6378137),
    Miles(3960);

    /**
     * Stores the value of the unit.
     */
    private final int value;

    /**
     * Default constructor to initialize an unit.
     *
     * @param value to be set.
     */
    Unit(int value) {
        this.value = value;
    }

    /**
     * Returns the value of the 'value' property.
     *
     * @return the value.
     */
    public int getValue() {
        return value;
    }
}
