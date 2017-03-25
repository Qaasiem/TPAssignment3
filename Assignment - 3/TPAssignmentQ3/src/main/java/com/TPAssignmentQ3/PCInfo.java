package com.TPAssignmentQ3;

import java.io.Serializable;
/**
 * Created by qaasiem on 2017-03-25.
 */
public class PCInfo implements Serializable
{
    private String make;
    private String model;
    private String processor;
    private String ram;

    public PCInfo(String make, String model, String processor, String ram)
    {
        this.make = make;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String getProcessor()
    {
        return processor;
    }

    public String getRam()
    {
        return ram;
    }

}


