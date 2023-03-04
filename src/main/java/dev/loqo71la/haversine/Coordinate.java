package dev.loqo71la.haversine;

public class Coordinate {

    /**
     * Stores the latitude of the coordinate.
     */
    private double latitude;

    /**
     * Stores the longitude of the coordinate.
     */
    private double longitude;

    /**
     * Default constructor to initialize a coordinate.
     *
     * @param latitude  latitude of the coordinate.
     * @param longitude longitude of the coordinate.
     */
    public Coordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Returns the value of the 'longitude' property.
     *
     * @return the longitude.
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the 'longitude' property.
     *
     * @param longitude to be set.
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Returns the value of the 'latitude' property.
     *
     * @return the latitude.
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the 'latitude' property.
     *
     * @param latitude to be set.
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
