public class Triangle {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    public double getArea ()
    {
        return 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0)
        {
            this.base = base;
        }
        else
        {
            throw new IllegalArgumentException("Base of the triangle cannot be 0");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0)
        {
            this.height = height;
        }
        else
        {
            throw new IllegalArgumentException("Height of the triangle cannot be 0");
        }
    }
}
