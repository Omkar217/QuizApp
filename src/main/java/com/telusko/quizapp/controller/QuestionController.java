package com.telusko.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.quizapp.entity.Question;
import com.telusko.quizapp.service.QuestionService;

@RestController
@RequestMapping("/api")
public class QuestionController {
	
	@Autowired
	QuestionService service;
	
	@GetMapping("/questions")
	public List<Question> getAllQuestions()
	{
		return service.getAllQuestions();
	}

}
