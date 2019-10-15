package com.ming.dao;

import com.ming.dbc.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class DaoImpl implements Dao {
    private Connection connection = null;
    private PreparedStatement PreparedStatement=null;


    public DaoImpl(Connection _connection) throws Exception {
        connection=_connection;
    }

    @Override
    public boolean doCreate(Object o) throws Exception {
        return false;
    }

    @Override
    public List<Object> findAll() throws Exception {
        return null;
    }
}
