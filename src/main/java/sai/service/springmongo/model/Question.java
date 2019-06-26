package sai.service.springmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@Document(collection = "QuestionAndAnswer")
public class Question {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String  id;
    private String peosnId;
    private String subjectName;
    private String testName;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private List<String> answer;
    private String createdTimeStamp;
}
