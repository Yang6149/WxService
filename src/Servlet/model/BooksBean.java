package Servlet.model;

import java.util.Date;

/**
 *
 * Bookbean 使用builder构建
 */
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

    public static class Builder{
        private String Bnum;
        private String Bname;
        private String UID;
        private String Bimage;
        private String Btype;
        private String Bdiscription;
        private String Bprice;
        private Date Btime;
        private boolean Bstatus;

        public Builder Bnum(String Bnum){
            this.Bnum=Bnum;
            return this;
        }
        public Builder Bname(String Bname){
            this.Bname=Bname;
            return this;
        }
        public Builder UID(String UID){
            this.UID=UID;
            return this;
        }
        public Builder Bimage(String Bimage){
            this.Bimage=Bimage;
            return this;
        }
        public Builder Btype(String Btype){
            this.Btype=Btype;
            return this;
        }
        public Builder Bdiscription(String Bdiscription){
            this.Bdiscription=Bdiscription;
            return this;
        }
        public Builder Bprice(String Bprice){
            this.Bprice=Bprice;
            return this;
        }
        public Builder Btime(Date Btime){
            this.Btime=Btime;
            return this;
        }
        public Builder Bstatus(boolean Bstatus){
            this.Bstatus=Bstatus;
            return this;
        }

        private BooksBean build(){
            return new BooksBean(this);
        }
    }
    private BooksBean(Builder builder){
        Bnum=builder.Bnum;
        Bname=builder.Bname;
        UID=builder.UID;
        Bimage=builder.Bimage;
        Btype=builder.Btype;
        Bdiscription=builder.Bdiscription;
        Bprice=builder.Bprice;
        Btime=builder.Btime;
        Bstatus=builder.Bstatus;
    }

    @Override
    public String toString() {
        return "BooksBean{" +
                "Bnum='" + Bnum + '\'' +
                ", Bname='" + Bname + '\'' +
                ", UID='" + UID + '\'' +
                ", Bimage='" + Bimage + '\'' +
                ", Btype='" + Btype + '\'' +
                ", Bdiscription='" + Bdiscription + '\'' +
                ", Bprice='" + Bprice + '\'' +
                ", Btime=" + Btime +
                ", Bstatus=" + Bstatus +
                '}';
    }
    /*
    public static void main(String[] args) {
        BooksBean a =new Builder().Bimage("image").Bdiscription("discription").Bname("name").Bnum("num").UID("uid").Btype("type").Bprice("price").Btime(new Date())
                .Bstatus(true).build();
        System.out.println(a);
    }
     */


}
