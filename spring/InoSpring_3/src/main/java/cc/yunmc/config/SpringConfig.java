package cc.yunmc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan("cc.yunmc.dao")
@Import(JdbcConfig.class)
public class SpringConfig {

}
