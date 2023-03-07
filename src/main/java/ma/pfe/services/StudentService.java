package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentService {
    Long create(StudentDTO dto);
    boolean update(StudentDTO dto);
    boolean delete(Long id);
    List<StudentEntity> readAll();
}
