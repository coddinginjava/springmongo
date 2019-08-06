package sai.service.springmongo.controller;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sai.service.springmongo.model.Question;
import sai.service.springmongo.model.dbsave.QuestionAnswerDBSave;
import sai.service.springmongo.service.QuestionAnswerService;

@RestController
@AllArgsConstructor
@RequestMapping("/question")
public class QuestionController {

    private final QuestionAnswerService questionAnswerService;

	@PostMapping("/add")
	public ResponseEntity<List<QuestionAnswerDBSave>> saveQuestions(@RequestBody Question question) {

		List<QuestionAnswerDBSave> savedQuesttionsAnswers = questionAnswerService.addQuestionsAndAnswer(question);

		return  CollectionUtils.isNotEmpty(savedQuesttionsAnswers)
				? new ResponseEntity<>(savedQuesttionsAnswers, HttpStatus.CREATED)
				: new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}

	@GetMapping("/get/all")
	public List<QuestionAnswerDBSave> getAllQuestions() {
		return questionAnswerService.getAll();
	}

//    @GetMapping("/get/{id}")
//    public Optional<Question> getById(@PathVariable String id){
//        return questionRepository.findById(id);
//    }
//
//
//    @GetMapping("/delete/{id}")
//    public String deleteById(@PathVariable String id){
//         questionRepository.deleteById(id);
//         return "deleted";
//    }
//
//    @GetMapping("/delete/all")
//    public String deletell_recorde(){
//        questionRepository.deleteAll();
//        return "all Deleted";
//    }
//
//    @GetMapping("/get/tsubjectName/{subjectnme}")
//    public List<Question> getBySubjectNmea(@PathVariable String subjectnme){
//        return questionRepository.findBySubjectName(subjectnme);
//    }

}
