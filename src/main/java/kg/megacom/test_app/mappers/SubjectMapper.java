package kg.megacom.test_app.mappers;

import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectMapper {

    SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);

    Subject toSubject(SubjectDto subjectDto);

    SubjectDto toSubjectDto(Subject subject);

    List<Subject> toSubjectList(List<SubjectDto> subjectDtos);

    List<SubjectDto> toSubjectDtoList(List<Subject> subjects);


}
