package com.ming.dao;

import com.ming.vo.Books;

import java.sql.*;
import java.util.ArrayList;
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
        if(CreateBooks(book)){
            return flag;
        }
        return flag;



    }

    @Override
    public List<Books> findAll() throws Exception {
        String sql="SELECT * FROM Books";
        this.preparedStatement = this.connection.prepareStatement(sql);
        ResultSet rs = this.preparedStatement.executeQuery();
        List<Books> list=new ArrayList<Books>();
        while(rs.next()){
            list.add(ResultSet2Books(rs));
        }

        return list;
    }

    @Override
    public Books findByid(int num) throws Exception {
        String sql = "SELECT * FROM books WHERE BOOK_ID="+num;
        this.preparedStatement = this.connection.prepareStatement(sql);
        ResultSet result = this.preparedStatement.executeQuery();
        Books book = ResultSet2Books(result);
        result.close();
        this.preparedStatement.close();

        return book;
    }
    //define a method change result to books
    private Books ResultSet2Books(ResultSet rs) throws SQLException {
        if(rs.next()){
            Books book=new Books.Builder().BookID(rs.getString("BOOK_ID")).BookName(rs.getString("BOOK_NAME"))
                    .UserID(rs.getString("USER_ID")).BookISBN(rs.getString("BOOK_ISBN"))
                    .BookAuthor(rs.getString("BOOK_AUTHOR")).BookPress(rs.getString("BOOK_PRESS"))
                    .BookEdition(rs.getString("BOOK_EDITION")).BookPtime(rs.getDate("BOOK_PTIME"))
                    .BookOprice(rs.getInt("BOOK_OPRICE")).BookNprice(rs.getInt("BOOK_NPRICE"))
                    .BookCount(rs.getInt("BOOK_COUNT")).BookSortFirst(rs.getString("BOOK_SORTFIRST"))
                    .BookSortSecond(rs.getString("BOOK_SORTSECOND")).BookSortThird(rs.getString("BOOK_SORTTHIRD"))
                    .BookImage(rs.getString("BOOK_IMAGE")).BookRemarks(rs.getString("BOOK_REMARKS"))
                    .BookState1(rs.getInt("BOOK_STATE1")).BookState2(rs.getInt("BOOK_STATE2"))
                    .BookState3(rs.getInt("BOOK_STATE3")).BookState4(rs.getInt("BOOK_STATE4"))
                    .BookUpTime(rs.getDate("BOOK_UPTIME")).BookIsSelled(rs.getString("BOOK_ISSELLED")).build();
            return book;
        }
        return null;
    }

    private boolean CreateBooks(Books book) throws SQLException {
        try{
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
            if(this.preparedStatement.execute()){
                return true;
            }
            return false;
        }catch (Exception e){
            throw e;
        }
        finally {
            this.preparedStatement.close();
        }

    }

}
