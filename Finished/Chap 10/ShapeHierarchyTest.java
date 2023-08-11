public class ShapeHierarchyTest
{
    public static void main(String[] args)
    {
        Shape[] arr = new Shape[6];
        arr[0] = new Circle(5.0);
        arr[1] = new Square(2.0);
        arr[2] = new Triangle();
        arr[3] = new Sphere(4.0);
        arr[4] = new Cube(6.0);
        arr[5] = new RegularTetrahedron(3.0);
        for(Shape s : arr)
        {
            System.out.println(s);
            if(s instanceof Circle)
            {
                Circle ci = (Circle)s;
                System.out.printf("Area: %.2f%n", ci.getArea());
                continue;
            }
            if(s instanceof Square)
            {
                Square sq = (Square)s;
                System.out.printf("Area: %.2f%n", sq.getArea());
                continue;
            }
            if(s instanceof Triangle)
            {
                Triangle tr = (Triangle)s;
                System.out.printf("Area: %.2f%n", tr.getArea());
                continue;
            }
            if(s instanceof Sphere)
            {
                Sphere sp = (Sphere)s;
                System.out.printf("Area: %.2f%n", sp.getArea());
                System.out.printf("Volume: %.2f%n", sp.getVolume());
            }
            if(s instanceof Cube)
            {
                Cube cu = (Cube)s;
                System.out.printf("Area: %.2f%n", cu.getArea());
                System.out.printf("Volume: %.2f%n", cu.getVolume());
            }
            if(s instanceof RegularTetrahedron)
            {
                RegularTetrahedron te = (RegularTetrahedron)s;
                System.out.printf("Area: %.2f%n", te.getArea());
                System.out.printf("Volume: %.2f%n", te.getVolume());
            }
            System.out.println();
            System.out.println();
        }
    }
}
abstract class Shape
{
    public abstract String toString();
}
class TwoDimensionalShape extends Shape
{
    public String toString()
    {
        return "Two-Dimensional Shape: ";
    }
}
class ThreeDimensionalShape extends Shape
{
    public String toString()
    {
        return "Three-Dimensional Shape: ";
    }
}
class Circle extends TwoDimensionalShape
{
    private double radius;
    public Circle()
    {
        this(1.0);
    }
    public Circle(double r)
    {
        if(r <= 0)
            throw new IllegalArgumentException("Radius should be > 0");
        this.radius = r;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double r)
    {
        if(r <= 0)
            throw new IllegalArgumentException("Radius should be > 0");
        this.radius = r;
    }
    public double getArea()
    {
        return Math.PI * this.radius * this.radius;
    }
    public String toString()
    {
        return String.format("%s%s%n%s%.2f%n", super.toString(), "Circle", 
			"Radius: ", this.radius);
    }
}
class Square extends TwoDimensionalShape
{
    private double side;
    public Square()
    {
        this(1.0);
    }
    public Square(double s)
    {
        if(s <= 0)
            throw new IllegalArgumentException("Side length should be > 0");
        this.side = s;
    }
    public double getSide()
    {
        return this.side;
    }
    public void setSide(double s)
    {
        if(s <= 0)
            throw new IllegalArgumentException("Side length should be > 0");
        this.side = s;
    }
    public double getArea()
    {
        return this.side * this.side;
    }
    public String toString()
    {
        return String.format("%s%s%n%s%.2f%n", super.toString(), "Square", 
			"Side-length: ", this.side);
    }
}
class Triangle extends TwoDimensionalShape
{
    private double a;
    private double b;
    private double c;
    public Triangle()
    {
        this(1.0, 1.0, 1.0);
    }
    public Triangle(double a, double b, double c)
    {
        if(a <= 0)
            throw new IllegalArgumentException("Side 'a' should be > 0");
        if(b <= 0)
            throw new IllegalArgumentException("Side 'b' should be > 0");
        if(c <= 0)
            throw new IllegalArgumentException("Side 'c' should be > 0");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getSideA()
    {
        return this.a;
    }
    public double getSideB()
    {
        return this.b;
    }
    public double getSideC()
    {
        return this.c;
    }
    public void setSideA(double a)
    {
        if(a <= 0)
            throw new IllegalArgumentException("Side 'a' should be > 0");
        this.a = a;
    }
    public void setSideB(double b)
    {
        if(b <= 0)
            throw new IllegalArgumentException("Side 'b' should be > 0");
        this.b = b;
    }
    public void setSideC(double c)
    {
        if(c <= 0)
            throw new IllegalArgumentException("Side 'c' should be > 0");
        this.c = c;
    }
    public double getArea()
    {
        double s = (this.a + this.b + this.c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public String toString()
    {       
		return String.format("%s%s%n%s%.2f%n%s%.2f%n%s%.2f%n", super.toString(), 
			"Triangle", "Side A: ", this.a, "Side B: ", this.b, "Side C: ", this.c);
    }
}
class Sphere extends ThreeDimensionalShape
{
    public double radius;
    public Sphere()
    {
        this(1.0);
    }
    public Sphere(double r)
    {
        if(r <= 0)
            throw new IllegalArgumentException("Radius should be > 0");
        this.radius = r;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double r)
    {
        if(r <= 0)
            throw new IllegalArgumentException("Radius should be > 0");
        this.radius = r;
    }
    public double getArea()
    {
        return 4 * Math.PI * this.radius * this.radius;
    }
    public double getVolume()
    {
        return (4 / 3) * Math.PI * this.radius * this.radius * this.radius;
    }
    public String toString()
    {
        return String.format("%s%s%n%s%.2f%n", super.toString(), "Sphere",
			"Radius: ", this.radius);
    }
}
class Cube extends ThreeDimensionalShape
{
    public double edge;
    public Cube()
    {
        this(1.0);
    }
    public Cube(double e)
    {
        if(e <= 0)
            throw new IllegalArgumentException("Edge-length should be > 0");
        this.edge = e;
    }
    public double getEdge()
    {
        return this.edge;
    }
    public void setEdge(double e)
    {
        if(e <= 0)
            throw new IllegalArgumentException("Edge-length should be > 0");
        this.edge = e;
    }
    public double getArea()
    {
        return 6 * this.edge * this.edge;
    }
    public double getVolume()
    {
        return this.edge * this.edge * this.edge;
    }
    public String toString()
    {
        return String.format("%s%s%n%s%.2f%n", super.toString(), "Cube", 
			"Edge-length: ", this.edge);
    }
}
class RegularTetrahedron extends ThreeDimensionalShape
{
    public double edge;
    public RegularTetrahedron()
    {
        this(1.0);
    }
    public RegularTetrahedron(double e)
    {
        if(e <= 0)
            throw new IllegalArgumentException("Edge-length should be > 0");
        this.edge = e;
    }
    public double getEdge()
    {
        return this.edge;
    }
    public void setEdge(double e)
    {
        if(e <= 0)
            throw new IllegalArgumentException("Edge-length should be > 0");
        this.edge = e;
    }
    public double getArea()
    {
        return Math.sqrt(3) * this.edge * this.edge;
    }
    public double getVolume()
    {
        return (Math.sqrt(2) / 12) * this.edge * this.edge * this.edge;
    }
    public String toString()
    {
        return String.format("%s%s%n%s%.2f%n", super.toString(), 
			"Regular Tetrahedron", "Edge-length: ", this.edge);
    }
}
