package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.models.entities.Subject;

import java.util.List;

public interface SubjectService {

    SubjectDto save(SubjectDto subjectDto);

    SubjectDto findById(Long id);

    SubjectDto update(SubjectDto subject);

    SubjectDto delete(SubjectDto subject);

    List<SubjectDto> findAllByLang(LanguageDto language);
}
