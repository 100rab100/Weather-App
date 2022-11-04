public class MyClass 
{ 
 public static void main(String[] args) 
 { 
 try 
 { 
 int[] myNumbers = {1, 2, 3}; 
 System.out.println(myNumbers[10]); 
 } 
 catch (Exception e) 
 { 
 System.out.println(“Something went wrong.”); 
 } 
 } 
}




import java.util.Scanner;

public class ExceptionDemo 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Eneter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        
        
        try
        {
            c=a/b;
            System.out.println("Division is" +c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0, try again");
        }
        System.out.println("Bye");
        
        
    } 
}
