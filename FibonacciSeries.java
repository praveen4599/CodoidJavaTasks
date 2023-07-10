public class FibonacciSeries {
    

    public static int fibo(int n){ 
        // Declared it as static method so we can call this method inside the same clas

        if(n==0){
            return 0;
        }
        else if(n == 1){
            return 1; 
        }
        
        
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String args[]){

        int number = 6;
        System.out.println("Factorial of " + number + " is " + fibo(number));

    }

}