public class Q4{
    public static void main(String[] args){
        int n=1;
        int sumUptoN = 1;
        while(n<Math.sqrt(Integer.MAX_VALUE)){
            if(sumUptoN==n*n){
                System.out.println("Ans: "+n);
            }
            n=n+1;
            sumUptoN=sumUptoN+n;
        }
    }
}