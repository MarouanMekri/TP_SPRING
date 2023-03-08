package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    @Override
    public Long create(StudentDTO dto) {
        LOG.debug("start");
        LOG.debug("end");
        return null;
    }
    @Override
    public boolean update(StudentDTO dto) {
        LOG.debug("start");
        LOG.debug("end");
        return false;
    }
    @Override
    public boolean delete(Long id) {
        LOG.debug("start");
        LOG.debug("end");
        return false;
    }
    @Override
    public List<StudentEntity> readAll() {
        LOG.debug("start");
        LOG.debug("end");

        return null;
    }
}
