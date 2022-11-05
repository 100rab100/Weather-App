class HondaCity 
{ 
 static long price=10; 
 int a,b; 
 static double OnRoadPrice(String city) 
 { 
 Switch(city) 
 { 
 Case “Delhi”: 
 return price+price*0.1; 
 case “Mumbai”: 
 return price+preice*0.09; 
 } 
 } 
} 
class test 
{ 
 public static void main() 
 { }

 
 package staticpractice;

class Test
{
    static int x=10;
    int y=20;
    
    void show()
    {
        System.out.println(x+" "+y);
    }
    
    static void display()
    {
        System.out.println(x);
    }
}

public class StaticPractice {

    public static void main(String[] args) {
        
        Test t1=new Test();
        t1.show();
        t1.x=30;
        t1.y=50; 
        
        Test t2=new Test();
        t2.show();
        
    }
    
}
