package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.launchcode.javawebdevtechjobsmvc.Search;
import org.launchcode.javawebdevtechjobsmvc.models.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.launchcode.javawebdevtechjobsmvc.controllers.ListController.columnChoices;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController extends TechJobsController {


    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        model.addAttribute("x", "all");
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.
    @PostMapping("results")
    public String displaySearchResults(Model model, @RequestParam String searchType, @RequestParam String searchTerm){
        ArrayList<Job> searchResults = Search.searching(searchTerm, searchType);

        model.addAttribute("x", searchType);
        model.addAttribute("columns", columnChoices);
        model.addAttribute("jobs", searchResults);

        return "search";
    }
}
