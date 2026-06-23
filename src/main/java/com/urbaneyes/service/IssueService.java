package com.urbaneyes.service;

import java.util.List;
import com.urbaneyes.entity.Issue;
import com.urbaneyes.repository.IssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IssueService {

    private final IssueRepository issueRepository;

    public Issue save(Issue issue) {

        issue.setCreatedAt(LocalDateTime.now());
        issue.setStatus("REPORTED");

        return issueRepository.save(issue);
    }

    public List<Issue> getAllIssues() {
        return issueRepository.findAll();
    }

    public long getTotalIssues() {
        return issueRepository.count();
    }
    public List<Issue> findAll() {
        return issueRepository.findAll();
    }
}