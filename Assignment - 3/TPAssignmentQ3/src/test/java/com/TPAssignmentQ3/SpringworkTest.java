package com.TPAssignmentQ3;

import com.TPAssignmentQ3.Computers.Acer;
import com.TPAssignmentQ3.Config.Config;
import com.TPAssignmentQ3.Interface.PCInterface;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.assertEquals;

/**
 * Created by qaasiem on 2017-03-25.
 */
public class SpringworkTest extends TestCase
{
    private PCInterface pcI;
    private PCInterface pcI1;


    @BeforeMethod
    public void setUp() throws Exception
    {
        ApplicationContext AppCon = new AnnotationConfigApplicationContext(Config.class);
        pcI = (PCInterface)AppCon.getBean("AcerPC");

        ApplicationContext AppCon2 = new AnnotationConfigApplicationContext(Config.class);
        pcI1 = (PCInterface)AppCon2.getBean("AsusPC");
    }

    @Test
    public void testAcerMake() throws Exception
    {
        PCInfo in = pcI.getPCInfo();
        assertEquals(in.getMake(), "Acer");
    }

    @Test
    public void testAcerModel() throws Exception
    {
        PCInfo in = pcI.getPCInfo();
        assertEquals(in.getModel(), "47y873");
    }

    @Test
    public void testAcerProcessor() throws Exception
    {
        PCInfo in = pcI.getPCInfo();
        assertEquals(in.getProcessor(), "intel core i5");
    }

    @Test
    public void testAcerRam() throws Exception
    {
        PCInfo in = pcI.getPCInfo();
        assertEquals(in.getRam(), "8gig");
    }

    @Test
    public void testAsusMake() throws Exception
    {
        PCInfo in1 = pcI1.getPCInfo();
        assertEquals(in1.getMake(), "Asus");
    }

    @Test
    public void testAsusModel() throws Exception
    {
        PCInfo in1 = pcI1.getPCInfo();
        assertEquals(in1.getModel(), "701A");
    }

    @Test
    public void testAsusProcessor() throws Exception
    {
        PCInfo in1 = pcI1.getPCInfo();
        assertEquals(in1.getProcessor(), "intel core i5");
    }

    @Test
    public void testAsusRam() throws Exception
    {
        PCInfo in1 = pcI1.getPCInfo();
        assertEquals(in1.getRam(), "8gig");
    }
}
