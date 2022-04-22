package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.AnswerDao;
import kg.megacom.test_app.mappers.AnswerMapper;
import kg.megacom.test_app.mappers.QuestionMapper;
import kg.megacom.test_app.models.dto.AnswerDto;
import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.entities.Answer;
import kg.megacom.test_app.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;
    private AnswerMapper answerMapper = AnswerMapper.INSTANCE;
    private QuestionMapper questionMapper = QuestionMapper.INSTANCE;

    @Override
    public AnswerDto save(AnswerDto answerDto) {
        answerDto.setActive(true);
        Answer answer = answerDao.save(answerMapper.toAnswer(answerDto));
        return answerMapper.toAnswerDto(answer);
    }

    @Override
    public AnswerDto findById(Long id) {
        Answer answer = answerDao.findById(id).orElse(null);
        return answerMapper.toAnswerDto(answer);
    }

    @Override
    public AnswerDto update(AnswerDto answerDto) {
        AnswerDto answer = findById(answerDto.getId());
        if(answer != null){
            Answer answer1 = answerMapper.toAnswer(answerDto);
            answer1 = answerDao.save(answer1);
            return answerMapper.toAnswerDto(answer1);
        }
        return null;
    }

    @Override
    public AnswerDto delete(AnswerDto answerDto) {
        return null;
    }

    @Override
    public List<AnswerDto> findAllByQuestion(QuestionDto question) {
        List<Answer> answers = answerDao.findAllByQuestionAndIsActive(questionMapper.toQuestion(question), true);
        return answerMapper.toAnswerDtoList(answers);

    }

}
