package com.examsys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.examsys.Questions;
import com.examsys.QuestionRepository;

@Controller    
@RequestMapping(path="/demo")
public class QuestionController {
	@Autowired 
	private QuestionRepository questionRepository;


	@GetMapping(path="/allquestions")
	public @ResponseBody Iterable<Questions> getAllQuestions() {
		return questionRepository.findAll();
	}
        
        @GetMapping(path="/allbyid")
        public @ResponseBody Iterable<Questions> getAllQuestionsById() {
		return questionRepository.findAllQuestionsById(1);
	}
}