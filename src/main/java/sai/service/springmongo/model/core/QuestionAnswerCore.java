package sai.service.springmongo.model.core;

import java.util.List;

import lombok.Data;

@Data
public class QuestionAnswerCore {
	
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private List<String> answer;

}
