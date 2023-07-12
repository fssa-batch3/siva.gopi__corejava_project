package day02.solved;

public class App {
	public static void main(String[] args) {
		
		
		
	Person person1 = new Person();
	person1.setName("John");            
	String name1 = person1.getName();   
	System.out.println(name1);        
	
	
	
	Person2 person2 = new Person2();
	person2.setName("John");            
	String name2 = person2.getName();
	System.out.println(name2);       
	

	
    BankAccount acct1 = new BankAccount();
    acct1.setAccNo("A101");
    acct1.setName( "Krishna" );
    acct1.setBalance(1000);
    System.out.println(acct1.getAccNo());      
    System.out.println(acct1.getName());     
    System.out.println(acct1.getBalance());  
  
    ShapeCalculator calculator = new ShapeCalculator();
    double circleArea = calculator.calculateArea(3.5);
    
    System.out.println(circleArea);            
  
    Calculator calc = new Calculator();
    System.out.println(calc.add(2, 3));                // Output: 5
    System.out.println(calc.add(2.5, 3.7));           // Output: 6.2
    System.out.println(calc.add("Hello", "World"));  // Output: HelloWorld
	
}
}
