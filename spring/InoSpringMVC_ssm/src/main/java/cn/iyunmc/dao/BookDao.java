package cn.iyunmc.dao;

import cn.iyunmc.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookDao {

    @Insert("insert into tb1_book values(null,#{type},#{name},#{description})")
    public void save(Book book);

    @Update("update tb1_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    void update(Book book);

    @Delete("delete from tb1_book where id = #{id}")
    void delete(Integer id);

    @Select("select * from tb1_book where id = #{id}")
    Book getById(Integer id);

    @Select("select * from tb1_book")
    List<Book> getAll();
}
