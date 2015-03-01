import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author hacker13ua
 */
public class Main
{
    public static void main(String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        /*final Number factorialArgument = scanner.nextBigDecimal();
        final Factorial<BigDecimal> factorial= new StirlingFactorial();
        System.out.println(factorial.calculate((BigDecimal) factorialArgument));*/
        final Number factorialArgument = scanner.nextBigInteger();
        final Factorial<BigInteger> factorial= new SimpleFactorial();
        System.out.println(factorial.calculate((BigInteger) factorialArgument));
    }
}
//2432902008176640000