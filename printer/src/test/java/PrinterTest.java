import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrinterTest {
    Printer printerOne;

    @Before
    public void before(){ printerOne = new Printer(30);}

    @Test
    public void checkPaperLeft() {assertEquals(30, printerOne.getPaperLeft());}

    @Test
    public void checkPrint() {
        printerOne.print(5, 2);
        assertEquals(20, printerOne.getPaperLeft());
        assertEquals(90, printerOne.getTonerLeft());
    }

    @Test
    public void printNotEnoughPaper() {
        assertEquals("There is not enough paper", printerOne.print(105, 2));
    }

    @Test
    public void checkTonerStatus() {assertEquals(100, printerOne.getTonerLeft());}
}
