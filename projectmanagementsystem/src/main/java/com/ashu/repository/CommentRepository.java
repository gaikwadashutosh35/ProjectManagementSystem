package com.ashu.repository;

import com.ashu.modal.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment>findByIssueId(Long issueId);
}
