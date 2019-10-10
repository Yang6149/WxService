package Servlet.model;

/**
 * User对象
 */
public class UserBean {
    private String UID;
    private String Uname;
    private boolean Usex;
    private String Ugrade;
    private String Uacademy;
    private String Umajor;
    private String Uphone;
    private String Uwechat;


    public UserBean(){}

    public UserBean(String UID, String uname, boolean usex, String ugrade, String uacademy, String umajor, String uphone, String wechat) {
        this.UID = UID;
        this.Uname = uname;
        this.Usex = usex;
        this.Ugrade = ugrade;
        this.Uacademy = uacademy;
        this.Umajor = umajor;
        this.Uphone = uphone;
        this.Uwechat = wechat;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public boolean isUsex() {
        return Usex;
    }

    public void setUsex(boolean usex) {
        Usex = usex;
    }

    public String getUgrade() {
        return Ugrade;
    }

    public void setUgrade(String ugrade) {
        Ugrade = ugrade;
    }

    public String getUacademy() {
        return Uacademy;
    }

    public void setUacademy(String uacademy) {
        Uacademy = uacademy;
    }

    public String getUmajor() {
        return Umajor;
    }

    public void setUmajor(String umajor) {
        Umajor = umajor;
    }

    public String getUphone() {
        return Uphone;
    }

    public void setUphone(String uphone) {
        Uphone = uphone;
    }

    public String getUwechat() {
        return Uwechat;
    }

    public void setUwechat(String wechat) {
        this.Uwechat = wechat;
    }
}
