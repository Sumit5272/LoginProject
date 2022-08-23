package FinalInterfaceImplementation;

public interface ABC {

	int f=5;        //f&z for mult & div Method
    int z=5;
    
	int a=20;      //you can write also static final int a=20;
   void m1();     //public abtract
   public abstract void m2();//can declare like this also both are valid
   
   void sum(int x,int y);  //method accept parameter but not return anything (3methodcase)
   int difference(int x,int y);  //method will accept parameter & return type (4methodcase)
   
   void mult();           //not accept parameter & not return  (1methodcase)
   int div();             //not accept parameter &  return type (2method case)
   
   
   
   
   
   
}

