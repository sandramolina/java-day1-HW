import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void before(){ cal = new Calculator(); }

    @Test
    public void subtractsNumbers() {assertEquals(4, cal.subtracts(6,2));}

    @Test
    public void addsNumbers() {assertEquals(4, cal.add(2,2));}

    @Test
    public void multiplyNumbers() {assertEquals(4, cal.multiply(2,2));}

    @Test
    public void divideNumbers() {assertEquals(4.0, cal.divide(8.0, 2.0), 0.0);}
}
