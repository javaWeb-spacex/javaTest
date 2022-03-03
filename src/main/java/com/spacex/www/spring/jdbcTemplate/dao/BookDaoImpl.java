package com.spacex.www.spring.jdbcTemplate.dao;

import com.spacex.www.spring.jdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author :sbx
 * @date :2022/3/1 18:02
 * @description :
 * @version: :1.0.0
 */
@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void addBook(Book book) {
        String addsql="insert into t_book values(?,?,?)";
        String updatesql="update  t_book values(?,?,?)";
        Object[] args={book.getId(), book.getName(), book.getStatus()} ;

        /*添加、修改、删除*/
        int update = jdbcTemplate.update(addsql,args);

        System.out.println(update);
    }

    @Override
    public void updateBook(Book book) {
        String updateSql="update t_book set status=? where id=?";
        Object[] args={book.getStatus(),book.getId()} ;

        /*添加、修改、删除*/
        int update = jdbcTemplate.update(updateSql,args);

        System.out.println(update);
    }

    @Override
    public void deleteBook(String id) {
        String deleteSql="delete from t_book where id=?";

        /*添加、修改、删除*/
        int update = jdbcTemplate.update(deleteSql,id);

        System.out.println(update);
    }

    //
    @Override
    public Integer queryCount() {
        String sql="select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
        return count;
    }

    @Override
    public Book queryBook(String id) {
        String sql="select * from t_book where id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),id);
        System.out.println(book);
        return book;
    }

    @Override
    public List<Book> queryBooks() {
        String sql="select * from t_book ";
        List<Book> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        System.out.println(list);
        return list;
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql="insert into t_book values(?,?,?)";

        //批量添加
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql="update t_book set status=? where id=?";

        //批量修改
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql="delete from t_book where id=?";

        //批量修改
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));
    }


}
