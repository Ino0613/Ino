package cn.iyunmc.jdbc.Mapper;

import cn.iyunmc.jdbc.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();

    @Select("select * from tb_brand where id = #{id}")
    Brand selectById(int id);
}
