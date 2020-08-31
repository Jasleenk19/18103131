import java.util.Scanner;
public class Q1
{
    public static int Compare(String string1, String string2) 
        { 
            for (int i = 0; i < string1.length() &&  i < string2.length(); i++) { 
                if ((int)string1.charAt(i) ==  
                    (int)string2.charAt(i)) { 
                    continue; 
                }  
                else { 
                    return (int)string1.charAt(i) -  
                        (int)string2.charAt(i); 
                } 
            } 
      
            // Edge case for when two strings are of type "Find" and "Finding" 
            if (string1.length() < string2.length()) { 
                return (string1.length()-string2.length()); 
            }  
            else if (string1.length() > string2.length()) { 
                return (string1.length()-string2.length()); 
            } 
            // If both the strings are equal 
            else { 
                return 0; 
            } 
        }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the two strings : ");
        String s1, s2;
        s1 = obj.nextLine();
        s2 = obj.nextLine();
        int answer=Compare(s1,s2);
        if(answer>0)
        {
            System.out.println("Smaller string is: " +s2);
            System.out.println("Larger string is: " +s1);
        }
        else if(answer>0)
        {
            System.out.println("Smaller string is: " +s1);
            System.out.println("Larger string is: " +s2);
        } 
        else
        {
            System.out.println("Both strings are equal");
        }
    }
}