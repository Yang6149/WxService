package com.ming.dao;

import com.ming.vo.Books;

import java.util.List;

public interface BooksDao {
    public boolean doCreate(Books B)throws Exception;
    public List<Object> findAll()throws Exception;
}
