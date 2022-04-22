package kg.megacom.test_app.models.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class TestDto {

    private Long id;
    private String name;
    private String navi_user;
    private boolean active;
}
