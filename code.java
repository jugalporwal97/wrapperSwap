 public class Test {  
  
Integer x ;   
Integer y ;  

void setvalue(int a,int b){
	x = a;
	y = b;
}


public  void fn()  {   
System.out.println("Before swap" + x + y);        
swap(x,y);   
System.out.println("After swap" + x + y);        
}   
 
public void swap(Integer x2, Integer y2)  {    
Integer tmp = x2;    
x = y2;    
y = tmp;      
}




public static void main (String[] args) {
Test app = new Test();
int a = 10,b=20;
app.setvalue(a,b);
app.fn();
}
 
}
