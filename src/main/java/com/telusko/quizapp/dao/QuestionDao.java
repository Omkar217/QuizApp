package com.telusko.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.quizapp.entity.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> 
{
	 public List<Question> findAll();
}
