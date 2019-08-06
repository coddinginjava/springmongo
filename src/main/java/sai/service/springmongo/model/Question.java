package sai.service.springmongo.model;

import java.util.List;

import lombok.Data;
import sai.service.springmongo.model.core.QuestionAnswerCore;

@Data
public class Question {
	
    private String peosnId;
    private String subjectName;
    private String testName;
    private List<QuestionAnswerCore> questionAnswerCore;
    private String createdTimeStamp;
}
