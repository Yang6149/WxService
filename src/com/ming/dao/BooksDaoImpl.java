package com.ming.dao;

import com.ming.vo.Books;

import java.sql.Connection;
import java.sql.Date;
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
    public boolean doCreate(Books book) throws Exception {
        boolean flag = false;
        String sql = "INSERT INTO books(BOOK_ID, BOOK_NAME, USER_ID, BOOK_ISBN, BOOK_AUTHOR" +
                ",BOOK_PRESS,BOOK_EDITION,BOOK_PTIME,BOOK_OPRICE,BOOK_NPRICE,BOOK_COUNT,BOOK_SORTFIRST," +
                "BOOK_SORTSECOND,BOOK_SORTTHIRD,BOOK_IMAGE,BOOK_REMARKS,BOOK_STATE1,BOOK_STATE2,BOOK_STATE3,BOOK_STATE4,BOOK_UPTIME,BOOK_ISSELLED) VALUES " +
                "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?);";
        this.preparedStatement = this.connection.prepareStatement(sql);
        this.preparedStatement.setString(1,book.getBookID());
        this.preparedStatement.setString(2,book.getBookName());
        this.preparedStatement.setString(3,book.getUserID());
        this.preparedStatement.setString(4,book.getBookISBN());
        this.preparedStatement.setString(5,book.getBookAuthor());
        this.preparedStatement.setString(6,book.getBookPress());
        this.preparedStatement.setString(7,book.getBookEdition());
        this.preparedStatement.setDate(8, (Date) book.getBookPtime());
        this.preparedStatement.setDouble(9,book.getBookOprice());
        this.preparedStatement.setDouble(10,book.getBookNprice());
        this.preparedStatement.setDouble(11,book.getBookCount());
        this.preparedStatement.setString(12,book.getBookSortFirst());
        this.preparedStatement.setString(13,book.getBookSortSecond());
        this.preparedStatement.setString(14,book.getBookSortThird());
        this.preparedStatement.setString(15,book.getBookImage());
        this.preparedStatement.setString(16,book.getBookRemarks());
        this.preparedStatement.setInt(17,book.getBookState1());
        this.preparedStatement.setInt(18,book.getBookState2());
        this.preparedStatement.setInt(19,book.getBookState3());
        this.preparedStatement.setInt(20,book.getBookState4());
        this.preparedStatement.setDate(21, (Date) book.getBookUpTime());
        this.preparedStatement.setString(22,book.getBookIsSelled());


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
    public List<Books> findAll() throws Exception {
        String sql="SELECT * FROM Books";
        this.preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = this.preparedStatement.executeQuery();


        return null;
    }

    @Override
    public Books findByid(int num) throws Exception {
        return null;
    }
}
