package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.AnswerDto;
import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.entities.Answer;

import java.util.List;

public interface AnswerService {

    AnswerDto save(AnswerDto answerDto);

    AnswerDto findById(Long id);

    AnswerDto update(AnswerDto answer);

    AnswerDto delete(AnswerDto answer);

    List<AnswerDto> findAllByQuestion(QuestionDto question);
}
