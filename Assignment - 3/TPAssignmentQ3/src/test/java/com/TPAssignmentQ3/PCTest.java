package com.TPAssignmentQ3;

import com.TPAssignmentQ3.Computers.Acer;
import com.TPAssignmentQ3.Computers.Asus;
import com.TPAssignmentQ3.Computers.DELL;
import com.TPAssignmentQ3.Computers.Lenovo;
import junit.framework.TestCase;
import org.junit.Test;
import junit.framework.Assert;
/**
 * Created by qaasiem on 2017-03-25.
 */
public class PCTest extends TestCase
{
    @Test
    public void testAcer() throws Exception
    {
        PCInfo pc = new Acer().getPCInfo();
        assertEquals("8gig", pc.getRam());
    }

    @Test
    public void testAsus() throws Exception
    {
        PCInfo pc = new Asus().getPCInfo();
        assertEquals("Asus",pc.getMake());
    }

    @Test
    public void testDELL() throws Exception
    {
        PCInfo pc = new DELL().getPCInfo();
        assertEquals("65d67gd7",pc.getModel());
    }

    @Test
    public void testLenovo() throws Exception
    {
        PCInfo pc = new Lenovo().getPCInfo();
        assertEquals("intel core i5", pc.getProcessor());
    }
}
