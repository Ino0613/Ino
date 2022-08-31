package cn.iyunmc;

import cn.iyunmc.config.SpringConfig;
import cn.iyunmc.config.SpringMVCConfig;
import cn.iyunmc.domain.Book;
import cn.iyunmc.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class test {
    
    @Autowired
    private BookService bookServicel;

    @Test
    public void testGetById() {
        Book book = bookServicel.getById(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll() {
        List<Book> book = bookServicel.getAll();
        System.out.println(book);
    }

}
