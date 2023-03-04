package dev.loqo71la.haversine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HaversineTest {

    private Coordinate source;
    private Coordinate target;

    @BeforeEach
    public void setup() {
        source = new Coordinate(0, 0);
        target = new Coordinate(40.6892, 74.0445);
    }

    @Test
    public void calculateDistance_WithZeroCoordinates_ReturnsZero() {
        target.setLatitude(0);
        target.setLongitude(0);

        double result = Haversine.calculateDistance(source, source);
        double expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void calculateDistance_WithoutUnit_ReturnsTheDistanceInKilometersByDefault() {
        double result = Haversine.calculateDistance(source, target);
        double expected = 8669.777002644596;
        assertEquals(expected, result);
    }

    @Test
    public void calculateDistance_WithKilometerUnit_ReturnsTheDistanceInKilometers() {
        double result = Haversine.calculateDistance(source, target, Unit.Kilometers);
        double expected = 8669.777002644596;
        assertEquals(expected, result);
    }

    @Test
    public void calculateDistance_WithMeterUnit_ReturnsTheDistanceInMeters() {
        double result = Haversine.calculateDistance(source, target, Unit.Meters);
        double expected = 8679489.166899482;
        assertEquals(expected, result);
    }

    @Test
    public void calculateDistance_WithMileUnit_ReturnsTheDistanceInMiles() {
        double result = Haversine.calculateDistance(source, target, Unit.Miles);
        double expected = 5388.842713933856;
        assertEquals(expected, result);
    }
}
