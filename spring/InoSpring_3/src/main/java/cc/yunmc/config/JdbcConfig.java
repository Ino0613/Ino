package cc.yunmc.config;

import cc.yunmc.dao.BookDao;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
public class JdbcConfig {
    //1.定义一个方法获得要管理的对象
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/spring")
    private String url;
    @Value("root")
    private String username;
    @Value("Zhang010613.")
    private String password;

    @Bean
    public DataSource dataSource(BookDao bookDao){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        System.out.println(bookDao);
        return ds;
    }
}
