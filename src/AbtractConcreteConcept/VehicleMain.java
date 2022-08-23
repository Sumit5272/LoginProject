package AbtractConcreteConcept;

public class VehicleMain {

	public static void main(String[] args) {
		   Bus b=new Bus();
		  System.out.println(b.getnumberofwheels());
		  System.out.println(b.getnumberofpersons());
		 
		   System.out.println("-------------------");
		   Car c=new Car();
		   System.out.println(c.getnumberofwheels());
		   System.out.println(c.getnumberofpersons());
}
}