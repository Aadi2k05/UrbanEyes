package com.urbaneyes.controller;

import com.urbaneyes.entity.Issue;
import com.urbaneyes.service.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class IssueController {

    private final IssueService issueService;

    @GetMapping("/report")
    public String reportPage(Model model) {

        model.addAttribute("issue", new Issue());

        return "report";
    }

    @PostMapping("/report")
    public String submitIssue(@ModelAttribute Issue issue)
    {
        issue.setConfidenceScore(90);
        issue.setPriorityScore(80);
        issue.setRiskLevel("Medium");
        issue.setDegradationPercentage(20.0);

        issueService.save(issue);

        return "redirect:/dashboard";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {

        model.addAttribute("issues",
                issueService.getAllIssues());

        model.addAttribute("totalIssues",
                issueService.getTotalIssues());

        return "dashboard";
    }
}