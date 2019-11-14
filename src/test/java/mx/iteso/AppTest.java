package mx.iteso;

import static org.junit.Assert.assertEquals;
import mx.iteso.CellPhone;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSingleton()
    {
        CellPhone cell = new CellPhone("IPhone");
        assertEquals("Cell Phone: IPhone. Status: Connected to 192.168.0.1",cell.getData());
    }
}
