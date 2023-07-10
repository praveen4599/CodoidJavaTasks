import java.util.ArrayList;

interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);
 
    // An default function
    default void normalFun()
    {
       System.out.println("Hello");
    }

}


public class LambdaExpressions {
    
    interface FuncInter1 {
        int operation(int a, int b);
    }

    private int operate(int a, int b, FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }

    public static void main(String[] args) {
        
        Runnable runnable = () -> {
            System.out.println("Executing a task...");
        };

        /*Runnable runnable = () -> {
            System.out.println("Completed");
        }; 
        We can't add another abstract method inside a functional interface
        */

        new Thread(runnable).start();

        FuncInterface fobj = (int x)->System.out.println(2*x);
        fobj.abstractFun(5);
        fobj.normalFun();

        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
 
        // Using lambda expression to print all elements of array 
        arrL.forEach(n -> System.out.println(n));
 
        // Using lambda expression to print even elements of array
        System.out.println("Display even numbers in an array");
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n); 
                // here forEach return each element one by one without changing it's source
        });

        FuncInter1 add = (int x, int y) -> x + y; // Function definition as an expression

        LambdaExpressions lobj = new LambdaExpressions();
 
        // Add two numbers using lambda expression
        System.out.println("Addition is "
                           + lobj.operate(6, 3, add));
    }
}


/* Frequently asked  LambdaExpressions Questions
    Q1. What type of lambda expression Java?
    
    Answer:

    Java Lambda Expressions are the short block of code that accepts input as parameters and returns a resultant value.

    Q2. Is it good to use lambda expressions in Java?
    Answer:

    Yes, using lambda expressions makes it easier to use and support other APIs.

    Q3. What are the drawbacks of Java lambda?
    Answer:

    Java lambda functions can be only used with functional interfaces.
*/