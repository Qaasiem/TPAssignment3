package Question2Test;

import Question2.Acer;
import Question2.PCInfo;
import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-03-26.
 */
public class PCTest extends TestCase
{

    public void testAcerMake() throws Exception
    {
        PCInfo pc = new Acer().getPCInfo();
        assertEquals("Acer", pc.getMake());
    }


    public void testAcerModel() throws Exception
    {
        PCInfo pc = new Acer().getPCInfo();
        assertEquals("47y873",pc.getModel());
    }


    public void testAcerProcessor() throws Exception
    {
        PCInfo pc = new Acer().getPCInfo();
        assertEquals("intel core i5",pc.getProcessor());
    }


    public void testAcerRam() throws Exception
    {
        PCInfo pc = new Acer().getPCInfo();
        assertEquals("8gig", pc.getRam());
    }
}
