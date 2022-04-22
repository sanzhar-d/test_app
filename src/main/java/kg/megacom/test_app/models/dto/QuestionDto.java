package kg.megacom.test_app.models.dto;

import lombok.Data;

@Data
public class QuestionDto {

    private Long id;
    private String question;
    private SubjectDto subject;
    private boolean is_active;
    private String image;
    private int score;
}
