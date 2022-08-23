package ArrayAndStringPractice;

public class ReverseAndPalindrome {

	public static void main(String[] args) {
		
		//How to reverse the string in java & 2 line palindrome
		String original="nayan";
		String reverse="";
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}System.out.println(reverse);
		
		if(original.equals(reverse)) {
			System.out.println("This is palindrome");
		}else
			System.out.println("This is not palindrome");
		
		
		
		
		
		
	}
}
