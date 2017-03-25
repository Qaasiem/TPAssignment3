package com.TPAssignmentQ3.Config;

import com.TPAssignmentQ3.Computers.Acer;
import com.TPAssignmentQ3.Computers.Asus;
import com.TPAssignmentQ3.Computers.DELL;
import com.TPAssignmentQ3.Computers.Lenovo;
import com.TPAssignmentQ3.Interface.PCInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by qaasiem on 2017-03-25.
 */
@Configuration
public class Config
{
    @Bean(name = "AcerPC")
    public PCInterface getAcer()
    {
        return new Acer();
    }

    @Bean(name = "AsusPC")
    public PCInterface getAsus()
    {
        return new Asus();
    }

    @Bean(name = "DELLPC")
    public PCInterface getDell()
    {
        return new DELL();
    }

    @Bean(name = "LenovoPC")
    public PCInterface getLenovo()
    {
        return new Lenovo();
    }
}
