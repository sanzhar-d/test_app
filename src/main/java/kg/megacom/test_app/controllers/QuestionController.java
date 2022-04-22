package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.services.QuestionService;
import kg.megacom.test_app.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    @Autowired
    private SubjectService subjectService;

    @GetMapping("/get/byQuestion")
    public List<QuestionDto> findAllBySubject(@RequestParam Long subjectId){
        SubjectDto subjectDto = subjectService.findById(subjectId);
        return questionService.findAllBySubject(subjectDto);
    }
}
