package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.TestSubjectDto;
import kg.megacom.test_app.models.entities.TestSubject;

public interface Test_SubjectService {

    TestSubjectDto save(TestSubjectDto testSubjectDto);

    TestSubjectDto findById(Long id);

    TestSubjectDto update(TestSubjectDto test_subject);

    TestSubjectDto delete(TestSubjectDto test_subject);
}
