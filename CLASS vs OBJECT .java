
package java1;

class Circle 
{
    public double radius;
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
            
    
}
public class Java1 {

    public static void main(String[] args) {
     Circle c1=new Circle();
     c1.radius=7;
     System.out.println("Area:"+c1.area());
     System.out.println("Perimeter:"+c1.perimeter());
     System.out.println("Circumference:"+c1.circumference());
    }
    
}



package rectangletest;

class Rectangle
{
    public double length;
    public double breadth;
    
    public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
    
}

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10.5;
        r.breadth=5.5;
        
        System.out.println("Area"+r.area());
        System.out.println("perimeter"+r.perimeter());
        
        System.out.println("Is it a Square"+r.isSquare());
    }
    
}






