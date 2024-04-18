
package com.jitendra.pertsol.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitendra.pertsol.entity.Comments;
import com.jitendra.pertsol.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentsService {

	@Autowired
	private CommentRepository repository;

	@Override
	public List<Comments> getAllComments() {
		return repository.findAll();
	}

	@Override
	public List<Comments> getCommentsByUsername(String username) {
		Comments comments = new Comments();
		comments.setBy(username);
		return repository.findAll();
	}

	@Override
	public List<Comments> getCommentsByDate(Date dateofcomment) {
		return repository.findAll();
	}

}
