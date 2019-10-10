package Servlet.model;

import java.sql.Date;

public class OrderBean {
    private String Onum;//订单号
    private String Buyernum;//买家id
    private String Sellernum;//卖家id
    private Date OcommitTime;//进入交易状态时间
    private Date Finashtime;//完成交易时间
    private boolean Bstatus;//当前状态0：未交易 1：交易中
    private String Bprice;//价格
    private String Bnum;//书籍id

    public String getOnum() {
        return Onum;
    }

    public void setOnum(String onum) {
        Onum = onum;
    }

    public String getBuyernum() {
        return Buyernum;
    }

    public void setBuyernum(String buyernum) {
        Buyernum = buyernum;
    }

    public String getSellernum() {
        return Sellernum;
    }

    public void setSellernum(String sellernum) {
        Sellernum = sellernum;
    }

    public Date getOcommitTime() {
        return OcommitTime;
    }

    public void setOcommitTime(Date ocommitTime) {
        OcommitTime = ocommitTime;
    }

    public Date getFinashtime() {
        return Finashtime;
    }

    public void setFinashtime(Date finashtime) {
        Finashtime = finashtime;
    }

    public boolean isBstatus() {
        return Bstatus;
    }

    public void setBstatus(boolean bstatus) {
        Bstatus = bstatus;
    }

    public String getBprice() {
        return Bprice;
    }

    public void setBprice(String bprice) {
        Bprice = bprice;
    }

    public String getBnum() {
        return Bnum;
    }

    public void setBnum(String bnum) {
        Bnum = bnum;
    }
}
