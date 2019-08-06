package sai.service.springmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import sai.service.springmongo.model.Question;
import sai.service.springmongo.model.dbsave.QuestionAnswerDBSave;

public interface QuestionAnswerRepository extends MongoRepository<QuestionAnswerDBSave,String> {




}
