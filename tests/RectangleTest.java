import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    // Initialize the objects
    private Rectangle rectangle;
    private Rectangle square;

    // this runs before every test
    @BeforeEach
    void setUp()
    {
        // before each test the object is rebuild
        // each time we get a fresh object to test
        /*
           Rectangle with L 10 W 20
           Square with L 20 W 20
        */
        rectangle = new Rectangle(10,20);
        square = new Rectangle(20,20);
    }

    @Test
    void getPerimeterRectangle()
    {
        // Perimeter = 2 * L + 2 * W = 60
        /*
        * Expected for rectangle is 60
        * 1st param - expected output
        * 2nd param - actual output
        */
        assertEquals(60,rectangle.getPerimeter());
    }
    @Test
    void getPerimeterSquare()
    {
        // Perimeter = 2 * L + 2 * W = 80
        /*
         * Expected for square is 80
         * 1st param - expected output
         * 2nd param - actual output
         */
        assertEquals(80,square.getPerimeter());
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
        rectangle.setLength(50);  // set the length to 50
        assertEquals(50, rectangle.getLength());
    }
    /* this is one way of doing it */
    @Test
    void setLengthInvalidLowValue1()
    {
        // lowest value allowed for length -> greater thn 0
        try
        {
            // if length is 0
            rectangle.setLength(0);  // this value is not allowed so its an IllegalArgumentException
            // explicitly calling to fail
            fail("Length of 0 is not allowed! Trigger an exception");   // <-- test will fail
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());  // print error message
        }
    }
    /* setLengthInvalidValue1 and setLengthInvalidValue2 does te same thing but in 2 different ways 2nd method is more compact than the method 1 */
    @Test
    void setLengthInvalidValue2 ()
    {
        assertThrows(IllegalArgumentException.class, ()-> {
            rectangle.setLength(-1);  // This is an illegal value so throw an exception
        });
    }

    @Test
    void setWidth() {
        rectangle.setWidth(40);
        assertEquals(40,rectangle.getWidth());
    }

    @Test
    void setWidthInvalidValue ()
    {
        try
        {
            rectangle.setWidth(0);  // value not allowed
            fail("Width of 0 is not allowed! Exception is thrown");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());  // print error message
        }
        // Other method
//        assertThrows(IllegalArgumentxception.class, ()-> {
//           rectangle.setWidth(0);
//        });

    }
}