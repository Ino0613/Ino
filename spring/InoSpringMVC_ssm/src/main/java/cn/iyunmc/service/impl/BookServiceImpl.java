package cn.iyunmc.service.impl;

import cn.iyunmc.dao.BookDao;
import cn.iyunmc.domain.Book;
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
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return false;
    }

    @Override
    public Book getById(Integer id) {
        bookDao.getById(id);
        return null;
    }

    @Override
    public List<Book> getAll() {
        bookDao.getAll();
        return null;
    }
}
