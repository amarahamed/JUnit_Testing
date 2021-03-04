import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private Triangle triangle;

    @BeforeEach
    void setUp()
    {
        triangle = new Triangle(40,8);
    }

    @Test
    void getArea()
    {
        assertEquals(160, triangle.getArea());
    }

    @Test
    void setBase()
    {
        triangle.setBase(20);
        assertEquals(20, triangle.getBase());
    }

    @Test
    void setBaseInvalidValue()
    {
        assertThrows(IllegalArgumentException.class, ()-> {
            triangle.setBase(0);
        });
    }

    @Test
    void setHeight()
    {
        triangle.setHeight(10);
        assertEquals(10, triangle.getHeight());
    }

    @Test
    void setHeightInvalidValue()
    {
        assertThrows(IllegalArgumentException.class, ()-> {
           triangle.setHeight(0);
        });
    }
}