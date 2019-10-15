package com.ming.vo;


import java.util.Date;

/**
 *
 * Bookbean 使用builder构建
 */
public class Books {
    private String BookID;
    private String BookName;
    private String UserID;
    private String BookISBN;
    private String BookImage;
    private String BookSortFirst;
    private String BookRemarks;
    private double BookOprice;
    private Date BookUpTime;
    private boolean BookIsSelled;

    private String BookAuthor;
    private String BookPress;
    private String BookEdition;
    private Date BookPtime;
    private int BookNprice;
    private int BookCount;
    private String BookSortSecond;
    private String BookSortThird;

    private int BookState1;
    private int BookState2;
    private int BookState3;
    private int BookState4;

    public static class Builder{
        private String BookID;
        private String BookName;
        private String UserID;
        private String BookISBN;
        private String BookImage;
        private String BookSortFirst;
        private String BookRemarks;
        private double BookOprice;
        private Date BookUpTime;
        private boolean BookIsSelled;

        private String BookAuthor;
        private String BookPress;
        private String BookEdition;
        private Date BookPtime;
        private int BookNprice;
        private int BookCount;
        private String BookSortSecond;
        private String BookSortThird;

        private int BookState1;
        private int BookState2;
        private int BookState3;
        private int BookState4;

        public Builder BookID(String BookID){
            this.BookID=BookID;
            return this;
        }
        public Builder BookName(String BookName){
            this.BookName=BookName;
            return this;
        }
        public Builder UserID(String UserID){
            this.UserID=UserID;
            return this;
        }
        public Builder BookISBN(String BookISBN){
            this.BookISBN=BookISBN;
            return this;
        }
        public Builder BookImage(String BookImage){
            this.BookImage=BookImage;
            return this;
        }
        public Builder BookSortFirst(String BookSortFirst){
            this.BookSortFirst=BookSortFirst;
            return this;
        }
        public Builder BookRemarks(String BookRemarks){
            this.BookRemarks=BookRemarks;
            return this;
        }
        public Builder BookOprice(double BookOprice){
            this.BookOprice=BookOprice;
            return this;
        }
        public Builder BookUpTime(Date BookUpTime){
            this.BookUpTime=BookUpTime;
            return this;
        }
        public Builder BookIsSelled(boolean BookIsSelled){
            this.BookIsSelled=BookIsSelled;
            return this;
        }


        public Builder BookAuthor(String  BookAuthor){
            this.BookAuthor=BookAuthor;
            return this;
        }
        public Builder BookPress(String  BookPress){
            this.BookPress=BookPress;
            return this;
        }
        public Builder BookEdition(String  BookEdition){
            this.BookEdition=BookEdition;
            return this;
        }
        public Builder BookPtime(Date  BookPtime){
            this.BookPtime=BookPtime;
            return this;
        }
        public Builder BookNprice(int  BookNprice){
            this.BookNprice=BookNprice;
            return this;
        }
        public Builder BookCount(int  BookCount){
            this.BookCount=BookCount;
            return this;
        }
        public Builder BookSortSecond(String  BookSortSecond){
            this.BookSortSecond=BookSortSecond;
            return this;
        }
        public Builder BookSortThird(String  BookSortThird){
            this.BookSortThird=BookSortThird;
            return this;
        }

        public Builder BookState1(int  BookState1){
            this.BookState1=BookState1;
            return this;
        }public Builder BookState2(int  BookState2){
            this.BookState2=BookState2;
            return this;
        }public Builder BookState3(int  BookState3){
            this.BookState3=BookState3;
            return this;
        }public Builder BookState4(int  BookState4){
            this.BookState4=BookState4;
            return this;
        }






        private Books build(){
            return new Books(this);
        }
    }
    private Books(Builder builder){
        BookID=builder.BookID;
        BookName=builder.BookName;
        UserID=builder.UserID;
        BookImage=builder.BookImage;
        BookSortFirst=builder.BookSortFirst;
        BookRemarks=builder.BookRemarks;
        BookOprice=builder.BookOprice;
        BookUpTime=builder.BookUpTime;
        BookIsSelled=builder.BookIsSelled;
        BookISBN=builder.BookISBN;

        BookAuthor=builder.BookAuthor;
        BookPress=builder.BookPress;
        BookEdition=builder.BookEdition;
        BookPtime=builder.BookPtime;
        BookNprice=builder.BookNprice;
        BookCount=builder.BookCount;
        BookSortSecond=builder.BookSortSecond;
        BookSortThird=builder.BookSortThird;

        BookState1=builder.BookState1;
        BookState2=builder.BookState2;
        BookState3=builder.BookState3;
        BookState4=builder.BookState4;
    }


}
    /*
    public static void main(String[] args) {
        Books a =new Builder().BookImage("image").BookRemarks("discription").BookName("name").BookID("num").UserID("UserID").BookSortFirst("type").BookOprice("price").BookUpTime(new Date())
                .BookIsSelled(true).build();
        System.out.println(a);
    }
     */



