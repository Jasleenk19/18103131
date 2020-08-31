import java.util.Scanner;
public class Q2
{
	public static void countSort(int arr[]) 
    { 
        int n = arr.length;    
        int count[] = new int[21]; //Since elements are in range 0-20
        for (int i=0; i<21; i++) 
            count[i] = 0; 
        //To store the count of each number 
        for (int i=0; i<n; i++) 
            count[arr[i]]++; 
  
        int j=0;
        for(int i=0;i<21;i++){
            for(int k=0;k<count[i];k++){
                arr[j] = i;
                j++;
            }
        } 
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements (in range 0-20), any element outside the range will be considered as 0");
        int x;
        for(int i=0;i<n;i++){
            x = obj.nextInt();
            if(x>20 || x<0)
            {
            	x=0;
            }
            arr[i]=x;
        }
        countSort(arr);
        System.out.print("Sorted array is "); 
        for (int i=0; i<arr.length; ++i) 
            System.out.print(arr[i]+" ");
    }
}