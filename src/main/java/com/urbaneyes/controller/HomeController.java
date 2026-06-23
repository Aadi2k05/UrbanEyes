package com.urbaneyes.controller;

import com.urbaneyes.service.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final IssueService issueService;

    @GetMapping("/")
    public String home() {
        return "index";
    }
}