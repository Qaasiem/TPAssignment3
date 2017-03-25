package com.TPAssignmentQ3.Computers;

import com.TPAssignmentQ3.Interface.PCInterface;
import com.TPAssignmentQ3.PCInfo;

/**
 * Created by qaasiem on 2017-03-25.
 */
public class Asus implements PCInterface
{
    public PCInfo getPCInfo()
    {
        PCInfo PC = new PCInfo("Asus","701A", "intel core i5","8gig");
        return PC;
    }

}
