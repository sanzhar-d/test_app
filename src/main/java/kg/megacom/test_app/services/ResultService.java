package kg.megacom.test_app.services;

import kg.megacom.test_app.models.entities.Result;

public interface ResultService {

    Result save();

    Result findById(Long id);

    Result update(Result result);

    Result delete(Result result);
}
