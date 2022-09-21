package cn.iyunmc.jdbc;

import cn.iyunmc.jdbc.Mapper.BrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemo {

    public static void main(String[] args) throws IOException {
        //1.加载MyBatis的核心配置文件,获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取对应的Session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //List<Brand> list = sqlSession.selectList("test.selectAll");
        //System.out.println(list);

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        System.out.println(brands);
        Brand brand = mapper.selectById(1);
        System.out.println(brand);
        sqlSession.close();
    }
}
