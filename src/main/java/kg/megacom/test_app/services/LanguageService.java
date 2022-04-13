package kg.megacom.test_app.services;

import kg.megacom.test_app.models.Language;

public interface LanguageService {

    Language save(Language language);

    Language findById(Long id);

    Language update(Language language);

    Language delete(Language language);

    Language findAll();
}
