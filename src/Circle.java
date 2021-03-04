public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getArea ()
    {
        // formula 1/2 * PI * radius
        return 0.5*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0)
        {
            this.radius = radius;
        }
        else
        {
            throw new IllegalArgumentException("Radius can not be zero! should be > 0");
        }
    }

    public String toString ()
    {
        // " .1f " only display 1 digit after decimal point
        return String.format("Circle with radius %.1f", radius);
    }
}
