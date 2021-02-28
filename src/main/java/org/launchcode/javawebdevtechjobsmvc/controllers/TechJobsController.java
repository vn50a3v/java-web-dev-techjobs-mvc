package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {
    HashMap<String, String> actionChoices = new HashMap<>();


    @ModelAttribute("actions")
    public static void getActionChoices (HashMap actionChoices){

        //return ;
    }
}
