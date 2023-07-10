/* The "final" keyword is used to declare a variable, method, or class as unchangeable or non-overridable.

 */

/* For classes: When a class is declared as "final", it cannot be subclassed or extended by any other class. 
   It indicates that the class is complete and cannot be further specialized. */

final class FinalClass {
    private final int value;

    public FinalClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


public class FinalVsFinally{


    /* For methods: When a method is declared as "final", it cannot be overridden by any subclass but can be overloaded by using parameters. 
       This is often used when a class wants to enforce a specific implementation of a method and prevent subclasses from modifying it. */

    public final static void printMessage() {
        System.out.println("This method cannot be overridden.");
    
    }

    public static void main(String[] args){
        
        /* For variables: When a variable is declared as "final", its value cannot be modified once it has been assigned.
           It creates a constant that cannot be reassigned. */
        try{
        final int x = 10; // x is a constant with a value of 10
        printMessage();

        FinalClass fc = new FinalClass(x+1);
        System.out.println(fc.getValue());
        System.out.println(x);
        } catch(Exception e){
            System.out.println("Error");
        } finally{ 
            /* The "finally" block is used in exception handling to ensure that a block of code is always executed, 
                regardless of whether an exception is thrown or not. It is placed after the try-catch block and is executed regardless of whether an exception occurs or not. It is often used to release resources or perform cleanup operations */
            System.out.println("The End");
        }
    }
}

/* "final" is used to declare a variable, method, or class as unchangeable or non-overridable, 
    while "finally" is used in exception handling to ensure a block of code is always executed, regardless of whether an exception is thrown or not. */