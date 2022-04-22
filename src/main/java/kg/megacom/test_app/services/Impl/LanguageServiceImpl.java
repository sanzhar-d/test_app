package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.LanguageDao;
import kg.megacom.test_app.mappers.LanguageMapper;
import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageDao languageDao;
    private LanguageMapper languageMapper = LanguageMapper.INSTANCE;

    @Override
    public LanguageDto save(LanguageDto languageDto) {
        Language language = languageMapper.languageDtoToLanguage(languageDto);
        language.set_active(true);
        Language languageSaved = languageDao.save(language);
        return languageMapper.languageToLanguageDto(languageSaved);
    }

    @Override
    public LanguageDto findById(Long id) {
        Language language = languageDao.findById(id).orElse(null);
        return languageMapper.languageToLanguageDto(language);
    }

    @Override
    public LanguageDto update(LanguageDto language) {
        boolean isExist = languageDao.existsById(language.getId());
        if(!isExist){
            return null;
        }else{
           Language updatedLanguage = languageDao.save(languageMapper.languageDtoToLanguage(language));
           return languageMapper.languageToLanguageDto(updatedLanguage);
        }
    }

    @Override
    public LanguageDto delete(LanguageDto language) {
        language.set_active(false);
        LanguageDto deletedLanguage = update(language);
        return deletedLanguage;
    }

    @Override
    public List<LanguageDto> findAllByActive() {
        List<Language> languages = languageDao.findAllByActive();
        return languageMapper.languageListToLanguageDtoList(languages);
    }
}
