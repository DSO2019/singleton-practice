package com.mycompany.app;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Test
     */
    @Test
    public void testSingleton(){
        CellPhone cellPhone = new CellPhone("SamsungA10");
        assertEquals("Phone: SamsungA10. Status: Connected to Network",cellPhone.getNet());
    }



}
