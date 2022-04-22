package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.SubjectDao;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.services.SubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {


    private SubjectDao subjectDao;

    @Override
    public Subject save() {
        return null;
    }

    @Override
    public Subject findById(Long id) {
        return subjectDao.findById(id).orElse(null);
    }

    @Override
    public Subject update(Subject subject) {
        return null;
    }

    @Override
    public Subject delete(Subject subject) {
        return null;
    }

    @Override
    public List<Subject> findAllByLang(Language language) {
        return null;
    }
}
