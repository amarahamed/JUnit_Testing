import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;
    private Rectangle square;

    // this runs before every test
    @BeforeEach
    void setUp()
    {
        // before each test the object is rebuild
        rectangle = new Rectangle(10,20);
        square = new Rectangle(20,20);
    }

    @Test
    void getPerimeter()
    {
        // Rectangle with L 10 W 20
        // Perimeter = 2 * L + 2 * W = 60
        /*
        * Expected for rectangle is 60
        * 1st param - expected output
        * 2nd param - actual output
        */
        assertEquals(60,rectangle.getPerimeter());
    }

    @Test
    void getArea()
    {
        // Rectangle L 10 W 20
        // Area = L * W = 200
        /*
         * Expected for rectangle is 200
         */
        assertEquals(200, rectangle.getArea());
    }

    @Test
    void setLength()
    {
        // lowest value allowed for length -> greater thn 0
        // max value allowed for length -> invalid
        rectangle.setLength(50);
        assertEquals(50, rectangle.getLength());
    }
    @Test
    void setLengthInvalidLowValue()
    {
        // lowest value allowed for length -> greater thn 0
        try
        {
            // if length is 0
            rectangle.setLength(0);  // this value is not allowed so its an IllegalArgumentException
            fail("Length of 0 is not allowed! Trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        rectangle.setLength(50);
        assertEquals(50, rectangle.getLength());
    }

    @Test
    void setWidth() {
    }
}