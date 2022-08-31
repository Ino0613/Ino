package cc.yunmc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

//@Configuration
//@ComponentScan("cc.yunmc")
//@PropertySource("classpath:jdbc.properties")
//@Import({JdbcConfig.class,MybatisConfig.class})
//public class SpringConfig {
//
//}

@Configuration
@ComponentScan("cc.yunmc")
@EnableAspectJAutoProxy
public class SpringConfig {

}