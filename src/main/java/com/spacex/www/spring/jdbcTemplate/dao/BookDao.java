package com.spacex.www.spring.jdbcTemplate.dao;

import com.spacex.www.spring.jdbcTemplate.entity.Book;

import java.util.List;

/**
 * @author :sbx
 * @date :2022/3/1 18:02
 * @description :
 * @version: :1.0.0
 */
public interface BookDao {
    public void addBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(String id);
    public Integer queryCount();
    public Book queryBook(String id);
    public List<Book> queryBooks();
    public void batchAdd(List<Object[]>batchArgs);
    public void batchUpdate(List<Object[]>batchArgs);
    public void batchDelete(List<Object[]> batchArgs);


}
