package com.ming.dao;

import java.util.List;

public interface Dao {
    public boolean doCreate(Object o)throws Exception;
    public List<Object> findAll()throws Exception;
}
