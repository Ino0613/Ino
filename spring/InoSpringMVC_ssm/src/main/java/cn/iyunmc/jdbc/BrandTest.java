package cn.iyunmc.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BrandTest {


    public static void main(String[] args) throws Exception {
        BrandTest bt = new BrandTest();
        bt.testSelectAll();
    }
    public void testSelectAll() throws Exception {
        Properties pro = new Properties();
        //2. 加载配置文件
        pro.load(new FileInputStream("src/main/resources/druid.properties"));

        //3. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);

        //4. 获取数据库链接Connection
        Connection conn = dataSource.getConnection();

        String sql = "select * from tb_brand;";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        List<Brand> brands = new ArrayList<>();

        while (rs.next()) {
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            String ordered = rs.getString("ordered");
            String description = rs.getString("description");
            Integer status = rs.getInt("status");
            Brand brand = new Brand();
            brand.setId(id);
            brand.setBrand_name(brandName);
            brand.setCompany_name(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);
            brands.add(brand);
        }
        System.out.println(brands);


        //释放资源
        rs.close();
        pstmt.close();
        conn.close();
    }

}
