package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.ResultDao;
import kg.megacom.test_app.models.dto.ResultDto;
import kg.megacom.test_app.models.entities.Result;
import kg.megacom.test_app.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private ResultDao resultDao;

    @Override
    public ResultDto save(ResultDto resultDto) {
        return null;
    }

    @Override
    public ResultDto findById(Long id) {
        return null;
    }

    @Override
    public ResultDto update(ResultDto result) {
        return null;
    }

    @Override
    public ResultDto delete(ResultDto result) {
        return null;
    }
}
