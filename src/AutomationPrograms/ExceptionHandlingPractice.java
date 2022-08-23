package AutomationPrograms;

public class ExceptionHandlingPractice {

	public static void main(String[]args) {
    	
	    System.out.println("The Program is started");
	    
	    //1.Arithmetic exception
//	      int a =100;
//	      System.out.println(100/0);
	    	  
	    //2.Null pointer exception
//	      String s=null;
//	      System.out.println(s.length());
	    	  
	    //3.number format expection
//	      String s="abcdef";
//	      int i=Integer.parseInt(s);
//	      System.out.println(i);
	      
	    //4.ArrayIndexoutofBoundsException
//	      int a[]=new int[5];
//	      a[10]=2000;
	        
	    //Exception Handling
//	    try {
//	    	int a =100;
//	        System.out.println(100/0);
//	        
//	    }
//	    catch(Exception e1){
//	        e1.printStackTrace();
//	    	System.out.println("Exception captured by generic block");
//	    }
//	    finally {
//	    	System.out.println("This is finally block->executed with try block as well as catch block");
//	    }
	    
	    //2nd risky code
	    try {
	    	
	    	String s=null;
	    	System.out.println(s.length());
	    	int a=100;
	    	System.out.println(100/0);
	    }
	    catch(Exception e1){
	    	e1.printStackTrace();
	    	System.out.println("Exception captured by generic block");
	    }
	    finally {
	    	System.out.println("This is finally block 2->executed with try block as well as catch block");
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	        System.out.println("The program is finished");
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	      }
}
