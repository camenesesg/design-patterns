package co.cesarmeneses.examples.designpatterns.bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BridgeTest {

    @Test
    public void whenBridgePatternInvoked_thenConfigSuccess() {
        // A square with red color
        Shape square = new Square(new Red());

        assertEquals(square.draw(), "Square drawn. Color is Red");
    }

    @Test
    public void whenBridgePatternInvoked_thenConfigSuccess1() {
        // A square with red color
        Shape square = new Triangle(new Blue());

        assertEquals(square.draw(), "Triangle drawn. Color is Blue");
    }
}
