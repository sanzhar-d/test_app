package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.QuestionDto;
import kg.megacom.test_app.models.entities.Question;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface QuestionMapper {

    QuestionMapper INSTANCE = Mappers.getMapper(QuestionMapper.class);

    Question toQuestion(QuestionDto questionDto);

    QuestionDto toQuestionDto(Question question);

    List<Question> toQuestionList(List<QuestionDto> questionDtos);

    List<QuestionDto> toQuestionDtoList(List<Question> questions);
}
