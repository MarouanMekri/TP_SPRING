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
    private final static Logger LOG= LoggerFactory.getLogger(StudentController.class);
    private StudentService service;
    StudentController(StudentService service){

        this.service=service;
    }
    @PostMapping
    public long create(@RequestBody StudentDTO dto){
        LOG.debug("start save dto:{}",dto);
        return service.create(dto);
    }
    @PutMapping
    public boolean update(@RequestBody StudentDTO dto){
        LOG.debug("start update dto:{}",dto);
        return service.update(dto);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
        LOG.debug("start method delete");
        return service.delete(id);
    }
    @GetMapping
    public List<StudentEntity> readAll() {
        LOG.debug("start method readAll");
        return service.readAll();
    }
}
