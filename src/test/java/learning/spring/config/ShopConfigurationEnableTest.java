package learning.spring.config;

import learning.spring.BinaryteaApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author codeLamb
 */
@SpringBootTest(classes = BinaryteaApplication.class, properties = {
        "binarytea.ready=true",
        "binarytea.opne-hours=8:30-22:00",

})
public class ShopConfigurationEnableTest {

    @Resource
    private ApplicationContext applicationContext;
    @Test
    void contextLoads() {
        assertNotNull(applicationContext.getBean(BinaryTeaProperties.class));
    }

    @Test
    void testPropertyValues() {
        BinaryTeaProperties properties = applicationContext.getBean(BinaryTeaProperties.class);
        assertTrue(properties.isReady());
        assertEquals("8:30-22:00", properties.getOpenHours());
    }
}
