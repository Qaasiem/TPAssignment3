package com.TPAssignmentQ3.Computers;

import com.TPAssignmentQ3.Interface.PCInterface;
import com.TPAssignmentQ3.PCInfo;
import com.sun.xml.internal.bind.v2.runtime.output.Pcdata;

/**
 * Created by qaasiem on 2017-03-25.
 */
public class DELL implements PCInterface
{
    public PCInfo getPCInfo()
    {
        PCInfo PC = new PCInfo("Dell", "65d67gd7", "intel core i7", "16gig");
        return PC;
    }
}
