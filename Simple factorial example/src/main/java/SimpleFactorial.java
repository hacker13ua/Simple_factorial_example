import java.math.BigInteger;

/**
 * @author hacker13ua
 */
public class SimpleFactorial implements Factorial<BigInteger>
{
    @Override
    public BigInteger calculate(final BigInteger argument)
    {
        if(argument.compareTo(BigInteger.ZERO) < 0)
        {
            throw new IllegalArgumentException("Argument must be positive");
        }
        return innerCalculate(argument);
    }

    private BigInteger innerCalculate(BigInteger argument)
    {
        if(argument.equals(BigInteger.ZERO))
        {
            return BigInteger.ONE;
        }
        return argument.multiply(innerCalculate(argument.subtract(BigInteger.ONE)));
    }
}
