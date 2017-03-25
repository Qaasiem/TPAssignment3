package com.assignment3.Question1;
import java.util.HashMap;
import java.util.Map;

public class CapricornToursMap
{
    Map <String, Integer> ToursMap = new HashMap<String, Integer>();

    public Map<String, Integer> getToursMap()
    {
        //Employee name and Employee ID
        ToursMap.put("Qaasiem", 2110);
        ToursMap.put("Suzanne", 2121);
        ToursMap.put("Riyaad", 2142);
        ToursMap.put("John", 2193);
        ToursMap.put("Jason", 2154);
        ToursMap.put("Clive", 2175);
        ToursMap.put("Sanders", 2186);

        return ToursMap;
    }



}
