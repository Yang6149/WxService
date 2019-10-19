package com.ming.dao;

import com.ming.vo.Books;
import com.alibaba.fastjson.*;
public class BooksDAOProxyTest {
    public static void main(String[] args) throws Exception {
        BooksDao bookDao = new BooksDaoProxy();
        Books b = new Books.Builder().build();
        //System.out.println(b);
        //bookDao.doCreate(b);
        b=bookDao.findByid(123);
        JSONObject jsonObject = (JSONObject) JSON.toJSON(b);
        System.out.println(jsonObject);
        //System.out.println(b);
        //bookDao.doCreate(Books b);
    }
}
