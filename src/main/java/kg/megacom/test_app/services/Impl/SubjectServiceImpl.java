package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.SubjectDao;
import kg.megacom.test_app.mappers.SubjectMapper;
import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDao subjectDao;
    private SubjectMapper subjectMapper = SubjectMapper.INSTANCE;

    @Override
    public SubjectDto save(SubjectDto subjectDto) {
        Subject subject = subjectMapper.toSubject(subjectDto);
        subject.setActive(true);
        subject = subjectDao.save(subject);
        return subjectMapper.toSubjectDto(subject);
    }

    @Override
    public SubjectDto findById(Long id) {
        Subject subject = subjectDao.findById(id).orElse(null);
        return subjectMapper.toSubjectDto(subject);
    }

    @Override
    public SubjectDto update(SubjectDto subject) {
        return null;
    }

    @Override
    public SubjectDto delete(SubjectDto subject) {
        return null;
    }

    @Override
    public List<SubjectDto> findAllByLang(LanguageDto language) {
        return null;
    }
}
