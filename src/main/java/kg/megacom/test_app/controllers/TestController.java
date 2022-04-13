package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.Language;
import kg.megacom.test_app.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class TestController {

    @Autowired
    private LanguageService languageService;

    @GetMapping("/test/save")
    public String testSaveLang(){
        Language language = new Language();
        language.setName("Java");

        Language savedLang = languageService.save(language);
        return savedLang.getName();
    }

}
