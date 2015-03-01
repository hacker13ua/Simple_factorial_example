import java.math.BigDecimal;

/**
 * @author hacker13ua
 */
public class StirlingFactorial implements Factorial<BigDecimal>
{
    private static final BigDecimal PI_2 = new BigDecimal(2.0 * Math.PI);
    private static final BigDecimal E = new BigDecimal(Math.E);


    @Override
    public BigDecimal calculate(final BigDecimal argument)
    {
        if(argument.compareTo(BigDecimal.ZERO) < 0)
        {
            throw new IllegalArgumentException("Argument must be positive");
        }
        if(argument.equals(BigDecimal.ZERO))
        {
            return BigDecimal.ONE;
        }
        return new BigDecimal(Math.sqrt(argument.multiply(PI_2).doubleValue()))
                .multiply(argument.divide(E, 100, BigDecimal.ROUND_HALF_UP).pow(argument.intValue()));
    }
}
