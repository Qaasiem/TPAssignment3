package com.assignment3;
import com.assignment3.Question1.CapricornToursMap;
import junit.framework.TestCase;

import java.util.Map;

public class CapricornToursMapTest extends TestCase
{
    CapricornToursMap CTM = new CapricornToursMap();

    //Checking for data
    public void testEmpty() throws Exception
    {
        assertFalse(CTM.getToursMap().isEmpty());
    }

    public void testValue() throws Exception
    {
        CapricornToursMap map = new CapricornToursMap();
        Map m1 = map.getToursMap();
        assertFalse((m1.containsValue(4)));
    }
}
