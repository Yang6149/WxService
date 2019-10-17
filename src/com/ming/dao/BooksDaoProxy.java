package com.ming.dao;

import com.ming.dbc.DataBaseConnection;
import com.ming.dbc.DatabaseConnectionFactory;
import com.ming.vo.Books;

import java.util.List;

public class BooksDaoProxy implements BooksDao {
    private DataBaseConnection conn = null;
    private BooksDao dao = null;

    public BooksDaoProxy() throws Exception {
        conn = DatabaseConnectionFactory.getDataBaseConnection();
        this.dao = new BooksDaoImpl(conn.getConnection());
    }

    @Override
    public boolean doCreate(Books B) throws Exception {
        boolean flag=false;
        if(this.dao.findByid(Integer.parseInt(B.getBookID()))==null){
            this.dao.doCreate(B);
            return true;
        }
        return false;
    }

    @Override
    public List<Books> findAll() throws Exception {
        return null;
    }

    @Override
    public Books findByid(int num) throws Exception {

        return dao.findByid(num);
    }
}
