public class Rectangle
{
    private int length, width;

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    /*
        Perimeter of the rectangle 2*Length + 2*W
     */
    public int getPerimeter()
    {
        return width * 2 + length * 2;  // change it later
    }
    /*
        Area = L * W
     */
    public int getArea()
    {
        return length*width;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length>0)
        {
            this.length = length;
        }
        else
        {
            throw new IllegalArgumentException(" Length should be greater than 0");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0)
        {
            this.width = width;
        }
        else
        {
            throw new IllegalArgumentException("Width should be greater than 0");
        }

    }
}
