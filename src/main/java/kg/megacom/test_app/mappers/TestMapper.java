package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.entities.Test;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TestMapper {

    TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);

    Test toTest(TestDto testDto);

    TestDto toTestDto(Test test);

    List<Test> toTestList(List<TestDto> testDtoList);

    List<TestDto> toTestDtoList(List<Test> testList);
}
