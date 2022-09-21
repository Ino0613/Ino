package cn.iyunmc.jdbc;

import cn.iyunmc.exception.SystemException;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {

        //1. 定义配置文件
        Properties pro = new Properties();
        //2. 加载配置文件
        pro.load(new FileInputStream("src/main/resources/druid.properties"));

        //3. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);

        //4. 获取数据库链接Connection
        Connection conn = dataSource.getConnection();

        System.out.println(conn);
//        System.out.println(System.getProperty("user.dir"));
    }
}
