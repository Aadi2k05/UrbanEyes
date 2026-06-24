package com.urbaneyes.controller;

import com.urbaneyes.entity.Issue;
import com.urbaneyes.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @Autowired
    private IssueRepository issueRepository;

    @GetMapping("/map")
    public String map(Model model) {

        model.addAttribute("issues",
                issueRepository.findAll());
        model.addAttribute("issueCount",
                issueRepository.count());
        return "map";
    }
}