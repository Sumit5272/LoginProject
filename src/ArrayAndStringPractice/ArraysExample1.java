package ArrayAndStringPractice;

public class ArraysExample1 {

	public static void main(String[] args) {
		
		//how to declare the array
		int a[]=new int[5];
		
		//how to add the value inside the array(0 and ending at n-1)
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//how many element are present inside the array
		System.out.println(a.length);
		
		//To read the array/iterative over an array
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
}}
