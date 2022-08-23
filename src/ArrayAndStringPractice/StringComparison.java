package ArrayAndStringPractice;

public class StringComparison {

	public static void main(String[] args) {
		
		String s1="Velocity";
		String s2="VELOCITY";
		String s3="Veloc";
		
		//1.equals():-compare the two string.
		System.out.println(s1.equals(s2)); //boolean value=>also check the case=>case sensitive method
		
		//2.equalsignorecase():-Compare the two strings but the casing will not matter=>only validate the content
		System.out.println(s1.equalsIgnoreCase(s2));  //true
		
		//3.contains():-compare one string is a part of another string=>case sensitive
		System.out.println(s1.contains(s3)); //true
		
		//4.isempty():-will check given string is empty or not
		System.out.println(s1.isEmpty());   //false =>true
		
		//5.concats:-will use to add two strings(+ operators:- user message and program output)
		
		String s4="ABC";
		String s5="XYZ";
		System.out.println(s4.concat(s5));
		System.out.println(s4.concat("LMN"));
		
		//6.startswith:-will check any string starts with a particular pattern
		System.out.println(s4.startsWith("AB"));  //true=>false
		
		//7.endwith:-will check any string ends with aperticular pattern.
		System.out.println(s4.endsWith("C"));
		
		//8.replace:-will help you to replace the part of the string by new string or new combination of character
		String s6="this is java automation class";
		System.out.println(s6.replace("java","python"));  //temparary operation=>this is not permanent
		
		String s7=s6.replace("automation","testing");     //permanent operation
		System.out.println(s7);
		
		//9.substring:-extract the part/portion of the string based on index
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,6));
		
		
		//10.slit():-to split your given string based on specific pattern
//		String s8="this@is@java@automation@testing@class";
//		String words[]=s8.split("@");
//		System.out.println(words.length);
	//	
//		for(int i=0;i<words.length;i++){
//		System.out.print(words[i]);
//		}
		
		//11.How to reverse the string in java.+2 line palindrome
		String original="sumit";
		String reverse="";
		for(int i=original.length()-1;i>=0;i--){
		reverse=reverse+original.charAt(i);
		}
		System.out.println(reverse);
		
		if(original.equals(reverse)) {
			System.out.println("This is palindrome");
		}else {
			System.out.println("This is not palindrome");
		}
}
}
