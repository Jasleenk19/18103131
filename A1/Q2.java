import java.util.*;
public class Q2{
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of replacement vector:");
    	int n = sc.nextInt();
    	System.out.println("Enter the words which need to be reduced:");
    	Set<String> set = new HashSet<String>();
    	for(int i = 0;i<n;i++){
    		set.add(sc.next());
    	}
    	System.out.println("Enter 'exit' to mark the end of paragraph");
    	System.out.println("Enter the paragraph:");
    	String word = sc.next();
    	StringBuffer para = new StringBuffer();
    	while(!word.equals("exit")){
    		if(set.contains(word)){
    			para.append(word.charAt(0)+"");
    			for(int i = 1;i<word.length();i++){
    				para.append("*");
    			}
    			para.append(" ");
    		}
    		else{
    			para.append(word);
    			para.append(" ");
    		}
    		word = sc.next();
    	}
    	System.out.print("Reduced paragraph is: ");
    	System.out.println(para.toString().trim());
    }   
}