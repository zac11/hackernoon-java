package Others;

public class fibonacciSeries {

    // given a range, print the fibonacci series up to that range

    public static void printFibonacci(int range){
        int n = range;
        int prev = 0;
        int curr = 1;
        for(int i =0;i<n;i++){
            int next = prev+curr;
            prev = curr;
            curr = next;
            System.out.println(" "+ next);

        }
    }

    public static void main(String [] args){
        printFibonacci(10);
    }
}
