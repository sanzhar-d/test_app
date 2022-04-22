package kg.megacom.test_app.models.dto;

import lombok.Data;

@Data
public class AnswerDto {

    private Long id;
    private String answer;
    private boolean is_true;
    private boolean is_active;
    private QuestionDto question;
}
