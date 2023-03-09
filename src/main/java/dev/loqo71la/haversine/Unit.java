package dev.loqo71la.haversine;

/**
 * Represents a unit of measure.
 */
public enum Unit {
    /**
     * Radius of curvature in Kilometers.
     */
    Kilometers(6371),

    /**
     * Radius of curvature in Meters.
     */
    Meters(6378137),

    /**
     * Radius of curvature in Miles.
     */
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
