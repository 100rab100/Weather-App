class Rectangle 
{ 
 public int length; 
 public int breadth; 
 public int area() 
 { 
 return length*breadth; 
 } 
 public int perimeter () 
 { 
 Return 2*(length+breadth); 
 } 
class test 
{ 
 public static void main() 
 { 
 Rectangle r=new Rectangle(); 
 } 
}




• In	above	example	there	is	given	two	data	members	length	and	
breadth	which	are	the	properties	of	the	class.	
• And	the	area	and	perimeter	is	the	method	of	the	class	where	both	the	
methods	are	performing	the	operations	on	the	given	data.	
• For	hiding	the	data,	the	data	members	will	have	the	stricter	(private)	
success	modiEier.	
• So,	when	the	data	is	made	private,	we	can’t	access	that	data	outside	
the	class.
