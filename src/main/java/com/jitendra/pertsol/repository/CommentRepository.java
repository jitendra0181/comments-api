package com.jitendra.pertsol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jitendra.pertsol.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Long> {

}
