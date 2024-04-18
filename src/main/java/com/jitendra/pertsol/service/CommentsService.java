package com.jitendra.pertsol.service;

import java.util.Date;
import java.util.List;

import com.jitendra.pertsol.entity.Comments;

public interface CommentsService {

	public List<Comments> getAllComments();

	public List<Comments> getCommentsByUsername(String username);
	
	public List<Comments> getCommentsByDate(Date dateofcomment);
	
}
