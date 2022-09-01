package cn.iyunmc.service;

import cn.iyunmc.domain.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 添加
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 查询单个
     * @param id
     * @return
     */
    Book getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Book> getAll();
}
