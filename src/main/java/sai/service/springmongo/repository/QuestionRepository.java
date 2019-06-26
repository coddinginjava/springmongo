package sai.service.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import sai.service.springmongo.model.Question;

import java.util.List;

public interface QuestionRepository extends MongoRepository<Question,String> {

    List<Question> findBySubjectName(String subjectnme);
}
