package sai.service.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import sai.service.springmongo.model.Question;

public interface QuestionRepository extends MongoRepository<Question,String> {
}
