package com.ashu.service;

import com.ashu.modal.Issue;
import com.ashu.modal.User;
import com.ashu.request.IssueRequest;

import java.util.List;

public interface IssueService {

    Issue getIssueById(Long issueId)throws Exception;

    List<Issue> getIssueByProjectId(Long projectId)throws Exception;

    Issue createIssue(IssueRequest issue, User user)throws Exception;

    void deleteIssue(Long issueId, Long userId)throws Exception;

    Issue adddUserToIssue(Long issueId, Long userId)throws Exception;

    Issue updateStatus(Long issueId,String status)throws Exception;
}
