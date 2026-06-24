package com.urbaneyes.controller;

import com.urbaneyes.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnalyticsController {

    @Autowired
    private IssueRepository issueRepository;

    @GetMapping("/analytics")
    public String analytics(Model model) {

        model.addAttribute("totalIssues",
                issueRepository.count());

        return "analytics";
    }
}