package com.example.datingplatformfordogs.repository;

import com.example.datingplatformfordogs.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query(value = "select distinct p.* from post p left join comment c on p.id = c.post_id where c.post_id = :postId",
            nativeQuery = true)
    Optional<Post> getPostByPostId(Long postId);
}
