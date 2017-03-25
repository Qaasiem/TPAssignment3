package com.assignment3;

import com.assignment3.Question1.CapricornToursList;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class CapricornToursListTest
    extends TestCase
{
    CapricornToursList CTL = new CapricornToursList();
    //Testing if the list is empty
    public void testEmptyList() throws Exception
    {
        assertFalse(CTL.GetList().isEmpty());
    }

    //checks the size of the list
    public void testSize() throws Exception
    {
        assertEquals(CTL.GetList().size(),6);
    }
}
