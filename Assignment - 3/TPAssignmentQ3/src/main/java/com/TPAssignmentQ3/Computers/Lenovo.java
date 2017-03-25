package com.TPAssignmentQ3.Computers;


import com.TPAssignmentQ3.Interface.PCInterface;
import com.TPAssignmentQ3.PCInfo;

/**
 * Created by qaasiem on 2017-03-25.
 */
public class Lenovo implements PCInterface
{
    public PCInfo getPCInfo()
    {
           PCInfo PC = new PCInfo("Lenovo", "80ud0017us", "intel core i5","8gig");
           return PC;
    }
}
