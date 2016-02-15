package test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import test.CD;
import test.CompactDisc;

/**
 * Created by jackie on 2/15/16.
 */
@Configuration
@ComponentScan(basePackageClasses = CompactDisc.class)
public class BeanConfig {
}
