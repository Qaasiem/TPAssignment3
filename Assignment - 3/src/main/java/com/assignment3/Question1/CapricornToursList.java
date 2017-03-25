package com.assignment3.Question1;
import java.util.ArrayList;
import java.util.List;

public class CapricornToursList
{
    List<String> TourList = new ArrayList<String>();

    public List<String> GetList()
    {
        TourList.add("Table Mountain");
        TourList.add("Robben Island");
        TourList.add("Chapmanspeak");
        TourList.add("Spier");
        TourList.add("Waterfront");
        TourList.add("Seal Island");

        return TourList;
    }

}
