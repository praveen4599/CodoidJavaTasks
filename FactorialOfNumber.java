public class FactorialOfNumber {
    
    public static int fact(int n){ 
        // Declared it as static method so we can call this method inside the same clas

        if(n==0 || n==1){
            return n;
        }
        else{

            return n * fact(n-1);
        }
    }
    public static void main(String args[]){

        int number = 5;
        System.out.println("Factorial of " + number + " is " + fact(number));

    }

}
