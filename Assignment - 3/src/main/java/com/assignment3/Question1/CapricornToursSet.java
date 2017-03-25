package com.assignment3.Question1;
import java.util.Set;
import java.util.HashSet;

public class CapricornToursSet
{
    Set <String> ToursSet = new HashSet<String>();
    public Set<String> getToursSet()
    {
        //Differents groups of tours for the week
        ToursSet.add("Group 1");
        ToursSet.add("Group 2");
        ToursSet.add("Group 3");
        ToursSet.add("Group 4");
        ToursSet.add("Group 5");
        ToursSet.add("Group 6");

        return ToursSet;
    }
}
