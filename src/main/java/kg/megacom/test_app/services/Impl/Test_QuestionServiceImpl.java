package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.Test_QuestionDao;
import kg.megacom.test_app.mappers.TestSubjectQuestionMapper;
import kg.megacom.test_app.models.dto.TestSubjectQuestionDto;
import kg.megacom.test_app.models.entities.TestSubjectQuestion;
import kg.megacom.test_app.services.Test_QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test_QuestionServiceImpl implements Test_QuestionService {

    @Autowired
    private Test_QuestionDao test_questionDao;
    private TestSubjectQuestionMapper  testSubjectQuestionMapper = TestSubjectQuestionMapper.INSTANCE;

    @Override
    public TestSubjectQuestionDto save(TestSubjectQuestionDto testSubjectQuestionDto) {
        return null;
    }

    @Override
    public TestSubjectQuestionDto findById(Long id) {
        TestSubjectQuestion testSubjectQuestion = test_questionDao.findById(id).orElse(null);
        return testSubjectQuestionMapper.toTestSubjectQuestionDto(testSubjectQuestion);
    }

    @Override
    public TestSubjectQuestionDto update(TestSubjectQuestionDto test_Subject_question) {
        return null;
    }

    @Override
    public TestSubjectQuestionDto delete(TestSubjectQuestionDto test_Subject_question) {
        return null;
    }
}
