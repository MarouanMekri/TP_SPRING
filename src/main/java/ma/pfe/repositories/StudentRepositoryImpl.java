package ma.pfe.repositories;

import javassist.bytecode.stackmap.TypeData;
import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{

    private final static Logger LOG= LoggerFactory.getLogger(StudentRepositoryImpl.class);

    @Override
    public Long create(StudentEntity e) {
        LOG.debug("start");
        LOG.debug("end");
        return null;
    }

    @Override
    public boolean update(StudentEntity e) {
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
