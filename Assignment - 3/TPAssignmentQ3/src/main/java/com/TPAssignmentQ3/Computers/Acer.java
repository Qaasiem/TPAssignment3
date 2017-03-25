package com.TPAssignmentQ3.Computers;

import com.TPAssignmentQ3.Interface.PCInterface;
import com.TPAssignmentQ3.PCInfo;

/**
 * Created by qaasiem on 2017-03-25.
 */
public class Acer implements PCInterface
{
    public PCInfo getPCInfo()
    {
        PCInfo PC = new PCInfo("Acer", "47y873", "intel core i5", "8gig");
        return PC;
    }
}
