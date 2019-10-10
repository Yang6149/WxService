package Servlet.model;

import java.sql.Date;

public class BooksBean {
    private String Bnum;
    private String Bname;
    private String UID;
    private String Bimage;
    private String Btype;
    private String Bdiscription;
    private String Bprice;
    private Date Btime;
    private boolean Bstatus;

    public String getBnum() {
        return Bnum;
    }

    public void setBnum(String bnum) {
        Bnum = bnum;
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String bname) {
        Bname = bname;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getBimage() {
        return Bimage;
    }

    public void setBimage(String bimage) {
        Bimage = bimage;
    }

    public String getBtype() {
        return Btype;
    }

    public void setBtype(String btype) {
        Btype = btype;
    }

    public String getBdiscription() {
        return Bdiscription;
    }

    public void setBdiscription(String bdiscription) {
        Bdiscription = bdiscription;
    }

    public String getBprice() {
        return Bprice;
    }

    public void setBprice(String bprice) {
        Bprice = bprice;
    }

    public Date getBtime() {
        return Btime;
    }

    public void setBtime(Date btime) {
        Btime = btime;
    }

    public boolean isBstatus() {
        return Bstatus;
    }

    public void setBstatus(boolean bstatus) {
        Bstatus = bstatus;
    }
}
