package cn.iyunmc.service.impl;

import cn.iyunmc.controller.Code;
import cn.iyunmc.dao.BookDao;
import cn.iyunmc.domain.Book;
import cn.iyunmc.exception.BusinessException;
import cn.iyunmc.exception.SystemException;
import cn.iyunmc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        if (id < 0) {
            throw new BusinessException(Code.SYSTEM_UNKNOW_ERR,"请不要使用你的技术来挑战我的耐性！");
        }
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {

        return bookDao.getAll();
    }
}
