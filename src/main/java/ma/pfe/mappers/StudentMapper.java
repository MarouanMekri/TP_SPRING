package ma.pfe.mappers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    StudentDTO convertToDTO(StudentEntity entity){
    StudentDTO studentDTO= new StudentDTO();
    studentDTO.setName(entity.getName());
    return studentDTO;
    }
    StudentEntity convertToEntity(StudentDTO dto){
        StudentEntity studentEntity= new StudentEntity();
        studentEntity.setId(dto.getId());
        return studentEntity;
    }

    List<StudentEntity> convertToEntities(List<StudentDTO>dtos){
        return dtos.stream().map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }
    List<StudentDTO> convertToDtos(List<StudentEntity>entities){
        return entities.stream().map(entity -> convertToDTO(entity)).collect(Collectors.toList());

    }

}

