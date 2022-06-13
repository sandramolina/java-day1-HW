import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void getVolume() { assertEquals(100, bottle.getVolume()); }

    @Test
    public void drink() {
        bottle.drink();
        bottle.drink();
        assertEquals(80, bottle.getVolume());
    }

    @Test
    public void empty() {
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fill() {
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
