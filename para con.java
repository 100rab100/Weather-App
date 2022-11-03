package superconstr;

class Parent
{
    Parent()
    {
        System.out.println("Non-Param of parent");
    }
    Parent(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Param of child");
    }
    Child(int y)
    {
        System.out.println("Param of child");
    }
    Child(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class SuperConstr {

    public static void main(String[] args) {
        //Child c=new Child();
        //Child c=new Child(20);
        Child c=new Child(10,20);
    }
    
}










package thissuper;


class Rectangle
{
    int length;
    int breadth;
    int x=10;
    
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
   
}

class Cuboid extends Rectangle
{
    int height;
    int x=20;
    
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}


public class ThisSuper 
{
    public static void main(String[] args) 
    {
    
           Cuboid c=new Cuboid(10,5,15);
           c.display();
        
    }   
}
