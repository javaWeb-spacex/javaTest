package com.spacex.www.spring.jdbcTemplate.service;

import com.spacex.www.spring.jdbcTemplate.dao.BookDao;
import com.spacex.www.spring.jdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author :sbx
 * @date :2022/3/1 18:02
 * @description :
 * @version: :1.0.0
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,rollbackFor = Exception.class)
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.addBook(book);
    }

    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }


    public Integer queryCount(){
        return bookDao.queryCount();
    }

    public Book queryBook(String id){
        return bookDao.queryBook(id);
    }

    public List<Book> queryBooks(){
        return bookDao.queryBooks();
    }

    public void  batchAdd(List<Object[]> batchArgs){
        bookDao.batchAdd(batchArgs);
    }

    public void  batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdate(batchArgs);
    }

    public void  batchDelete(List<Object[]> batchArgs){
        bookDao.batchDelete(batchArgs);
    }
}
