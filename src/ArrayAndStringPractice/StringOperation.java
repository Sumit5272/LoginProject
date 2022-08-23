package ArrayAndStringPractice;

public class StringOperation {

	public static void main(String[] args) {
		
		String s="Velocitye";
		String s1="   I am leaving in maharashtra";
		
		//1.length():-to find out the number of characters inside the string
		System.out.println(s.length());
		
		//2.UpperCase():-Convert the lower case into the upper case
		System.out.println(s.toUpperCase());
		
		//3.LowerCase():-Convert the uppercase or regular case letters into lower case
		System.out.println(s.toLowerCase());
		
		//4.charat():-this is use to find out the letter/alphabet available at particular index
		System.out.println(s.charAt(3));
		
		//5.indexof():-will help you to find out the index of any character/first occurance
		System.out.println(s.indexOf("e"));
		
		//6.lastindexof():-will help you to find out the last occurance of any character
		System.out.println(s.lastIndexOf("e"));
		
		
		//7.trim():-will help you to remove unwanted space at the starting or ending of the string
		System.out.println(s1);
		System.out.println(s1.trim());
		
	}
}
