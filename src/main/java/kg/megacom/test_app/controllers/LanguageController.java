package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/lang")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @PostMapping("/save")
    public LanguageDto save(@RequestBody LanguageDto languageDto){
         return languageService.save(languageDto);
    }

    @GetMapping("/get")
    public LanguageDto findById(@RequestParam Long id, @RequestParam(name = "userName", required = false, defaultValue = "test") String name){
        return languageService.findById(id);
    }

    @GetMapping("/list")
    public List<LanguageDto> findAll(){
        return languageService.findAllByActive();
    }

    @PutMapping("/update")
    public LanguageDto update(@RequestBody LanguageDto languageDto){
        return languageService.update(languageDto);
    }
}
