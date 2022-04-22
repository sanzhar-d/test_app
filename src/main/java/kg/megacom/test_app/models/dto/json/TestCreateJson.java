package kg.megacom.test_app.models.dto.json;

import lombok.Data;

import java.util.List;

@Data
public class TestCreateJson {

    private Long langId;
    private String name;
    private String author;
    private List<SubjectJson> subjectJsons;

}
