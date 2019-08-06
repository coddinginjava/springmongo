package sai.service.springmongo.service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import sai.service.springmongo.model.Question;
import sai.service.springmongo.model.dbsave.QuestionAnswerDBSave;

@Service
public class QuestionAnswerServiceHelper {

	public List<QuestionAnswerDBSave> dbSave(Question question) {

			List<QuestionAnswerDBSave> questionAnswerDBSaveList = question.getQuestionAnswerCore().parallelStream()
					.map(fromUI -> {
						QuestionAnswerDBSave questionAnswerDBSave = new QuestionAnswerDBSave();
						questionAnswerDBSave.setAnswer(fromUI.getAnswer());
						questionAnswerDBSave.setQuestion(fromUI.getQuestion());
						questionAnswerDBSave.setOptionA(fromUI.getOptionA());
						questionAnswerDBSave.setOptionB(fromUI.getOptionB());
						questionAnswerDBSave.setOptionC(fromUI.getOptionC());
						questionAnswerDBSave.setOptionD(fromUI.getOptionD());
						questionAnswerDBSave.setCreatedTimeStamp(OffsetDateTime.now().toString());
						questionAnswerDBSave.setTestName(question.getTestName());
						questionAnswerDBSave.setSubjectName(question.getSubjectName());
						questionAnswerDBSave.setPeosnId(question.getPeosnId());
						return questionAnswerDBSave;
					}).collect(Collectors.toList());
		return questionAnswerDBSaveList;
	}

}
