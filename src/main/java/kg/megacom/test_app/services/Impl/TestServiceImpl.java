package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.TestDao;
import kg.megacom.test_app.mappers.TestMapper;
import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.entities.Test;
import kg.megacom.test_app.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;
    private TestMapper testMapper = TestMapper.INSTANCE;

    @Override
    public TestDto save(TestDto testDto) {
        return null;
    }

    @Override
    public TestDto findById(Long id) {
        Test test = testDao.findById(id).orElse(null);
        return testMapper.toTestDto(test);
    }

    @Override
    public TestDto update(TestDto test) {
        return null;
    }

    @Override
    public TestDto delete(TestDto test) {
        return null;
    }

    @Override
    public List<TestDto> findAllByActive() {
        return null;
    }
}
