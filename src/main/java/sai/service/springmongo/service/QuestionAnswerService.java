package sai.service.springmongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sai.service.springmongo.model.Question;
import sai.service.springmongo.model.dbsave.QuestionAnswerDBSave;
import sai.service.springmongo.repository.QuestionAnswerRepository;

@Service
@AllArgsConstructor
public class QuestionAnswerService {

	private final QuestionAnswerRepository questionAnswerRepository;
	private final QuestionAnswerServiceHelper questionAnswerServiceHelper;

	public List<QuestionAnswerDBSave> addQuestionsAndAnswer(Question question) {

		List<QuestionAnswerDBSave> questionAnswerDBSave = questionAnswerServiceHelper.dbSave(question);

		List<QuestionAnswerDBSave> questionAnswerDBSaveDone = questionAnswerRepository.saveAll(questionAnswerDBSave);

		return questionAnswerDBSaveDone;
	}

	public List<QuestionAnswerDBSave> getAll() {
		return questionAnswerRepository.findAll();
	}

}
