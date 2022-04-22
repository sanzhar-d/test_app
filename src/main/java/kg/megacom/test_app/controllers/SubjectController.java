package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/save")
    public SubjectDto save(@RequestBody SubjectDto subjectDto){
        return subjectService.save(subjectDto);
    }


}
