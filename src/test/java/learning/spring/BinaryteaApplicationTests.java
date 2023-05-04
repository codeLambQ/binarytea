package learning.spring;

import learning.spring.BinaryteaApplication;
import static org.junit.jupiter.api.Assertions.*;

import learning.spring.config.BinaryTeaProperties;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

@SpringBootTest(classes = BinaryteaApplication.class, properties = {
        "binarytea.ready=true",
        "binarytea.opne-hours=8:30-22:00",

})
class BinaryteaApplicationTests {

    @Resource
    private ApplicationContext applicationContext;
    @Test
    void contextLoads() {
        assertNotNull(applicationContext.getBean(BinaryTeaProperties.class));
    }

}
