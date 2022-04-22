package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.ResultDto;
import kg.megacom.test_app.models.entities.Result;

public interface ResultService {

    ResultDto save(ResultDto resultDto);

    ResultDto findById(Long id);

    ResultDto update(ResultDto result);

    ResultDto delete(ResultDto result);
}
