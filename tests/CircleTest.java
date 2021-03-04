import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(10);
    }

    @Test
    void getArea() {
        // Area = PI * 1/2 * radius
        // Area = 3.14 * 0.5 * 10 = 15.7.....
        // assertEquals(15.707,circle.getArea());  the accuracy is high
         assertEquals(15.707,circle.getArea(),0.001);  // up to 3 decimal places
    }

    @Test
    void setRadius() {
        circle.setRadius(12);
        assertEquals(12, circle.getRadius());
    }

    @Test
    void setRadiusInvalidValue ()
    {
        assertThrows(IllegalArgumentException.class, ()-> {
            circle.setRadius(0);
        });

//        try
//        {
//            circle.setRadius(0);
//            fail("Radius entered is not allowed! Throw exception");
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }
    }

    @Test
    void testToString() {
        // Expected "Circle with radius 10"
        assertEquals("Circle with radius 10", circle.toString());
    }
}