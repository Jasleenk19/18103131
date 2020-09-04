import java.util.*;
public class Q3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scan.nextLine();
        char[] charstring = string.toCharArray();
        int n=charstring.length;
        char temp,minm;
        int one, two,index;
        for(int i=0;i<n-1;i++){
            one = charstring[i];
            index = i;
            for(int j=i+1;j<n;j++){
                two = charstring[j];
                if(one>two){
                    index = j;
                    one = two;
                }
            }
            temp = charstring[i];
            charstring[i] = charstring[index];
            charstring[index] = temp;
        }
        System.out.println(charstring);
    }
}