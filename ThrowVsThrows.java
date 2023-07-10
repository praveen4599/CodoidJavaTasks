import java.io.IOException;

public class ThrowVsThrows {
    
    /* throws in the method signature, we indicate that the method can potentially 
        throw both ArithmeticException and IOException, and the caller should handle them or propagate them further. */
        
    public static void divide(int dividend, int divisor) throws ArithmeticException, IOException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }

        if (dividend > 100) {
            throw new IOException("Dividend is too large");
        }

        int result = dividend / divisor;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        int dividend = 101;
        int divisor = 10;

        /* throw keyword to explicitly throw an ArithmeticException if the divisor is zero or an IOException 
        if the dividend is greater than 100. */

        try {
            divide(dividend, divisor);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
