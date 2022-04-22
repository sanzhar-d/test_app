package kg.megacom.test_app.services;

import kg.megacom.test_app.models.entities.Test;

import java.util.List;

public interface TestService {

    Test save();

    Test findById(Long id);

    Test update(Test test);

    Test delete(Test test);

    List<Test> findAllByActive();



}
