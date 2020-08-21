import java.util.*;
class Q4{
	static boolean anagrams(String string1, String string2) {
		int len1=string1.length();
		int len2=string2.length();
		if (len1!=len2) {
			return false;
		}
		int value=0;
		for (int i=0;i<len1;i++) {
			value=value^(int)string1.charAt(i);
			value=value^(int)string2.charAt(i);
			}
		return value==0;	
	}
	public static void main(String[] args) {
		String string1,string2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		string1=sc.nextLine();
		System.out.println("Enter second string:");
		string2=sc.nextLine();
		boolean answer=anagrams(string1,string2);
		if(answer==true)
			System.out.println("Strings are anagrams of each other");
		else
			System.out.println("Strings are not anagrams of each other");
	}
}
