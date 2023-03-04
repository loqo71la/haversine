package dev.loqo71la.haversine;

public class Haversine {

    /**
     * Store the value of number 2.
     */
    private static final int TWO = 2;

    /**
     * Calculates the distance in kilometers between two coordinates using the haversine formula.
     *
     * @param source source coordinate.
     * @param target target coordinate.
     * @return the distance in kilometers.
     */
    public static double calculateDistance(Coordinate source, Coordinate target) {
        return calculateDistance(source, target, Unit.Kilometers);
    }

    /**
     * Calculates the distance between two coordinates using the haversine formula.
     *
     * @param source source coordinate.
     * @param target target coordinate.
     * @param unit   distance measurement unit.
     * @return the distance in the requested unit.
     */
    public static double calculateDistance(Coordinate source, Coordinate target, Unit unit) {
        double deltaLongitude = Math.toRadians(target.getLongitude() - source.getLongitude());
        double deltaLatitude = Math.toRadians(target.getLatitude() - source.getLatitude());
        double sourceLatitude = Math.toRadians(source.getLatitude());
        double targetLatitude = Math.toRadians(target.getLatitude());

        double haversine = Math.pow(Math.sin(deltaLatitude / TWO), TWO)
                + Math.cos(sourceLatitude)
                * Math.cos(targetLatitude)
                * Math.pow(Math.sin(deltaLongitude / TWO), TWO);
        double inverseHaversine = Math.atan2(Math.sqrt(haversine), Math.sqrt(1 - haversine));
        return TWO * unit.getValue() * inverseHaversine;
    }
}
