package cn.iyunmc.controller;

import cn.iyunmc.domain.Book;
import cn.iyunmc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

//    @PostMapping
//    public boolean save(@RequestBody Book book) {
//        return bookService.save(book);
//    }
//
//    @PutMapping
//    public boolean update(@RequestBody Book book) {
//        return bookService.update(book);
//    }
//
//    @DeleteMapping("/{id}")
//    public boolean delete(@PathVariable Integer id) {
//        return bookService.delete(id);
//    }
//
//    @GetMapping("/{id}")
//    public Book getById(@PathVariable Integer id) {
//        return bookService.getById(id);
//    }
//
//    @GetMapping
//    public List<Book> getAll() {
//        return bookService.getAll();
//    }

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        boolean flag = book != null;
        Integer code = flag ? Code.GET_OK : Code.GET_ERR;
        String msg = flag ? "" : "数据查询失败，请重试！";

        //return new Result(flag ? Code.GET_OK : Code.GET_ERR, flag, flag ? "" : "未查询到结果，请重试!");
        return new Result(code, book, msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "" : "数据查询失败，请重试!";
        return new Result(code, bookList, msg);
    }
}
