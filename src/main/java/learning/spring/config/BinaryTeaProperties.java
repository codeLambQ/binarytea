package learning.spring.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author codeLamb
 */
@ConfigurationProperties("binarytea")
@Data
public class BinaryTeaProperties {
    private boolean ready;
    private String openHours;
}
