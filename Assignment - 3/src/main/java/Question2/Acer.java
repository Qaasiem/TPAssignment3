package Question2;

/**
 * Created by qaasiem on 2017-03-26.
 */
public class Acer implements PCInterface
{
    public PCInfo getPCInfo()
    {
        PCInfo PC = new PCInfo("Acer", "47y873", "intel core i5", "8gig");
        return PC;
    }
}

