package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.Test_SubjectDao;
import kg.megacom.test_app.mappers.TestSubjectMapper;
import kg.megacom.test_app.models.dto.TestSubjectDto;
import kg.megacom.test_app.models.entities.TestSubject;
import kg.megacom.test_app.services.Test_SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test_SubjectServiceImpl implements Test_SubjectService {

    @Autowired
    private Test_SubjectDao test_subjectDao;
    private TestSubjectMapper testSubjectMapper = TestSubjectMapper.INSTANCE;

    @Override
    public TestSubjectDto save(TestSubjectDto testSubjectDto) {
        return null;
    }

    @Override
    public TestSubjectDto findById(Long id) {
        TestSubject testSubject = test_subjectDao.findById(id).orElse(null);
        return testSubjectMapper.toTestSubjectDto(testSubject);
    }

    @Override
    public TestSubjectDto update(TestSubjectDto test_subject) {
        return null;
    }

    @Override
    public TestSubjectDto delete(TestSubjectDto test_subject) {
        return null;
    }
}
