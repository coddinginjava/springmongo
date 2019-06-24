package sai.service.springmongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sai.service.springmongo.model.Question;
import sai.service.springmongo.repository.QuestionRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;


    @PostMapping("/add")
    public String saveQuestions(@RequestBody Question question){
        questionRepository.save(question);

        System.out.println();
        return "Questions inserted";

    }

    @GetMapping("/get/all")
    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Question> getById(@PathVariable String id){
        return questionRepository.findById(id);
    }


    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable String id){
         questionRepository.deleteById(id);
         return "deleted";
    }

    @GetMapping("/delete/all")
    public String deletell_recorde(){
        questionRepository.deleteAll();
        return "all Deleted";
    }

}
