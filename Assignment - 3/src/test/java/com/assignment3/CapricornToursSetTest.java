package com.assignment3;

import com.assignment3.Question1.CapricornToursSet;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Set;

/**
 * Created by qaasiem on 2017-03-25.
 */
public class CapricornToursSetTest extends TestCase
{
    CapricornToursSet CTS = new CapricornToursSet();

    //Checking for data
    public void testEmpty() throws Exception
    {

        assertFalse(CTS.getToursSet().isEmpty());
    }

    public void testSize() throws Exception
    {
        Set s = CTS.getToursSet();
        assertEquals(s.size(),6);
    }
}
