package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;


@Controller
public class TechJobsController {
    HashMap<String, String> actionChoices = new HashMap<>();

    public TechJobsController() {
        actionChoices.put("all", "All");
        actionChoices.put("employer", "Employer");
        actionChoices.put("location", "Location");
        actionChoices.put("positionType", "Position Type");
        actionChoices.put("coreCompetency", "Skill");
    }

    @ModelAttribute("actions")
    public static HashMap<String, String> getActionChoices ( HashMap <String, String> actions, Model model){

     model.addAttribute("actions", actions);
     return actions;
    }
}
