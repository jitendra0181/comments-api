package com.jitendra.pertsol.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jitendra.pertsol.entity.Comments;
import com.jitendra.pertsol.service.CommentsService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v2/comments")
public class CommentsController {
	@Autowired
	private CommentsService commentService;

	@GetMapping
	public ResponseEntity<List<Comments>> getAllComments() {
		List<Comments> allComments = commentService.getAllComments();
		return new ResponseEntity<>(allComments, HttpStatus.OK);
	}

	@GetMapping("/search/{username}")
	public ResponseEntity<List<Comments>> getCommentsByBy(@RequestParam("username") String username) {
		List<Comments> commentsByBy = commentService.getCommentsByUsername(username);
		return new ResponseEntity<>(commentsByBy, HttpStatus.OK);
	}

	@GetMapping("/search/{date}")
	public ResponseEntity<List<Comments>> getCommentsByDate(@RequestParam("date") Date date) {
		List<Comments> commentsByDate = commentService.getCommentsByDate(date);
		return new ResponseEntity<>(commentsByDate, HttpStatus.OK);
	}

}
