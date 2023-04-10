package com.example.lesson8_t.pojo;

public class UserCard {
    private int uid;
    private String uname;
    private int cid;
    private int money;

    public UserCard() {
    }

    public UserCard(int uid, String uname, int cid, int money) {
        this.uid = uid;
        this.uname = uname;
        this.cid = cid;
        this.money = money;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
