package cc.yunmc.dao;

import cc.yunmc.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {

    @Insert("insert into tb1_account(name,money)values(#{name},#{money})")
    void save(Account account);

    @Update("update tb1_account set name = #{name}, money = #{money} where id = # {id}")
    void update(Account account);

    @Delete("delete from tb1_account where id = #{id}")
    void delete(Integer id);

    @Select("select * from tb1_account where id = #{id}")
    Account findById(Integer id);

    @Select("select * from tb1_account")
    List<Account> findAll();
}
