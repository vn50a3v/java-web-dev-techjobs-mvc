package org.launchcode.javawebdevtechjobsmvc;

import org.launchcode.javawebdevtechjobsmvc.models.Job;
import org.launchcode.javawebdevtechjobsmvc.models.JobData;


import java.util.ArrayList;

public class Search {

    public static ArrayList<Job> searching (String searchTerm, String searchType){
        if(searchTerm.equals("") || searchTerm.equals("all")) {
            return JobData.findAll();
        } else {
            return JobData.findByColumnAndValue(searchTerm,searchType);
        }
    }
}