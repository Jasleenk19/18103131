import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = obj.nextInt();

        if(n<=0)
        {
            System.out.println("Invalid Number");
        }
        else
        {
            System.out.println("Hailstone sequence: " + n);
            int count = 0;
            while(n!=1 && n<Integer.MAX_VALUE && n>0 && count<Integer.MAX_VALUE){
                if(n%2!=0){
                    n*=3;
                    n++;
                }
                else{
                    n/=2;
                }
                System.out.println(n);
                count++;
            }
            if(n==Integer.MAX_VALUE || n<0){
                System.out.println("Integer overflow reached");
            }
            else if (count==Integer.MAX_VALUE)
            {
                System.out.println("Maximum steps reached");
            }
        }
    }
}