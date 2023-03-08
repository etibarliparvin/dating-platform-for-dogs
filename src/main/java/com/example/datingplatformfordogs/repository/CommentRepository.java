package com.example.datingplatformfordogs.repository;

import com.example.datingplatformfordogs.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query(value = "select * from comment c where c.post_id = :postId", nativeQuery = true)
    List<Comment> findCommentsByPostId(Long postId);
}
