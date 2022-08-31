package co.yunmc.spring.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("co.yunmc.spring")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {

}
