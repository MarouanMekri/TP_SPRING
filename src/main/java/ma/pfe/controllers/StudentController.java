package ma.pfe.controllers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOG = LoggerFactory.getLogger(StudentController.class);
    private final StudentService studentService;

    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public long create(@RequestBody StudentDTO dto) {
        LOG.debug("start save dto:{}", dto);
        return studentService.create(dto);
    }

    @PutMapping
    public boolean update(@RequestBody StudentDTO dto) {
        LOG.debug("start update dto:{}", dto);
        return studentService.update(dto);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id) {
        LOG.debug("start method delete");
        return studentService.delete(id);
    }

    @GetMapping
    public List<StudentEntity> readAll() {
        LOG.debug("start method readAll");
        return studentService.readAll();
    }
}
