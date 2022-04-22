package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.TestSubjectQuestionDto;
import kg.megacom.test_app.models.entities.TestSubjectQuestion;

public interface Test_QuestionService {

    TestSubjectQuestionDto save(TestSubjectQuestionDto testSubjectQuestionDto);

    TestSubjectQuestionDto findById(Long id);

    TestSubjectQuestionDto update(TestSubjectQuestionDto test_Subject_question);

    TestSubjectQuestionDto delete(TestSubjectQuestionDto test_Subject_question);
}
