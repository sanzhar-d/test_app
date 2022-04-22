package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.entities.Language;

import java.util.List;

public interface LanguageService {

    LanguageDto save(LanguageDto language);

    LanguageDto findById(Long id);

    LanguageDto update(LanguageDto language);

    LanguageDto delete(LanguageDto language);

    List<LanguageDto> findAllByActive();
}
