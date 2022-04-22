package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.AnswerDto;
import kg.megacom.test_app.models.entities.Answer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AnswerMapper {

    AnswerMapper INSTANCE = Mappers.getMapper(AnswerMapper.class);

    Answer toAnswer(AnswerDto answerDto);

    AnswerDto toAnswerDto(Answer answer);

    List<Answer> toAnswerList(List<AnswerDto> answerDtoList);

    List<AnswerDto> toAnswerDtoList(List<Answer> answerList);



}
