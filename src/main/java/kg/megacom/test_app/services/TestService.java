package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.entities.Test;

import java.util.List;

public interface TestService {

    TestDto save(TestDto testDto);

    TestDto findById(Long id);

    TestDto update(TestDto test);

    TestDto delete(TestDto test);

    List<TestDto> findAllByActive();



}
