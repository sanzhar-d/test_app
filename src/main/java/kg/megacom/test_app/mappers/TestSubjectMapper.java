package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.TestSubjectDto;
import kg.megacom.test_app.models.entities.TestSubject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TestSubjectMapper {

    TestSubjectMapper INSTANCE = Mappers.getMapper(TestSubjectMapper.class);

    TestSubject toTestSubject(TestSubjectDto testSubjectDto);

    TestSubjectDto toTestSubjectDto(TestSubject testSubject);

    List<TestSubject> toTestSubjectList(List<TestSubjectDto> testSubjectDtoList);

    List<TestSubjectDto> toTestSubjectDtoList(List<TestSubject> testSubjectList);

}
