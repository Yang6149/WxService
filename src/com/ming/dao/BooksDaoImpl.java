package com.ming.dao;

import com.ming.vo.Books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class BooksDaoImpl implements BooksDao{
    private Connection connection = null;
    private PreparedStatement preparedStatement=null;


    public BooksDaoImpl(Connection _connection) throws Exception {
        connection=_connection;
    }

    @Override
    public boolean doCreate(Books emp) throws Exception {
        boolean flag = false;
        String sql = "INSERT INTO emp(empno, ename, job, hiredate, sal) VALUES (?, ?, ?, ?, ?);";
        this.preparedStatement = this.connection.prepareStatement(sql);
        // 赋值操作
//        this.preparedStatement.setInt(1, emp.getEmpno());
//        this.preparedStatement.setString(2, emp.getEname());
//        this.preparedStatement.setString(3, emp.getJob());
//        this.preparedStatement.setDate(4, new Date(emp.getHiredate().getTime()));
//        this.preparedStatement.setFloat(5, emp.getSal());
        // 更新行数大于0
        if(this.preparedStatement.executeUpdate() > 0){
            flag = true;
        }
        this.preparedStatement.close();
        return flag;



    }

    @Override
    public List<Object> findAll() throws Exception {
        String sql="SELECT * FROM Books";
        this.preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = this.preparedStatement.executeQuery();


        return null;
    }
}
