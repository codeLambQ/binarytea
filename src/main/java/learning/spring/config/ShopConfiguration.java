package learning.spring.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author codeLamb
 */
@Configuration
@EnableConfigurationProperties(BinaryTeaProperties.class)
@ConditionalOnProperty(name = "binarytea.ready", havingValue = "true")
public class ShopConfiguration {
}
