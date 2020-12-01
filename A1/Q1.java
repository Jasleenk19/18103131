import java.util.*;
public class Q1{
    public static void main(String args[]){
        System.out.println("Enter Main String");
    	Scanner sc = new Scanner(System.in);
    	String main_string = sc.next();
        System.out.println("Enter Sub-String");
    	String sub_string = sc.next();
        int len1=main_string.length();
        int len2=sub_string.length();
    	if(len2>len1){ // if substring is greater than main string then it is not present in main string
    		System.out.println("0");
    	}
        else
        {
        	char s[] = sub_string.toCharArray();
        	Arrays.sort(s);
        	sub_string = new String(s);
        	int answer = 0;
        	for(int i = 0;i<=len1-len2;i++){
        		String sub = main_string.substring(i,i+len2);
        		s = sub.toCharArray();
        		Arrays.sort(s);
        		sub = new String(s);
        		if(sub.equals(sub_string)){
        			answer++;
        		}
        	}
        	System.out.println("Number of times the substring exists in the main string is "+answer);
        }
    }   
                             
}