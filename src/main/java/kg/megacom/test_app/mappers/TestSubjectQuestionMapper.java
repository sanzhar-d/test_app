package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.TestSubjectQuestionDto;
import kg.megacom.test_app.models.entities.TestSubjectQuestion;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TestSubjectQuestionMapper {

    TestSubjectQuestionMapper INSTANCE = Mappers.getMapper(TestSubjectQuestionMapper.class);

    TestSubjectQuestion toTestSubjectQuestion(TestSubjectQuestionDto testSubjectQuestionDto);

    TestSubjectQuestionDto toTestSubjectQuestionDto(TestSubjectQuestion testSubjectQuestion);

    List<TestSubjectQuestion> toTestSubjectQuestionList(List<TestSubjectQuestionDto> testSubjectQuestionDtos);

    List<TestSubjectQuestionDto> toTestSubjectQuestionDtoList(List<TestSubjectQuestion> testSubjectQuestions);
}
