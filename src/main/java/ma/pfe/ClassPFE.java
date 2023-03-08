package ma.pfe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassPFE {
    private final static Logger LOGGER= LoggerFactory.getLogger(ClassPFE.class);
    public static void main(String[] args) {
        SpringApplication.run(ClassPFE.class);
        LOGGER.trace("start log 1");
        LOGGER.debug("start log 2");
        LOGGER.info("start log 3");
        LOGGER.error("start log 4");
        LOGGER.warn("start log 5");
    }
}
