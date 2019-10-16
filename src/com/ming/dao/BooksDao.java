package com.ming.dao;

import com.ming.vo.Books;

import java.util.List;

public interface BooksDao {
    public boolean doCreate(Books B)throws Exception;
    public List<Books> findAll()throws Exception;
    public Books findByid(int num)throws Exception;
}
