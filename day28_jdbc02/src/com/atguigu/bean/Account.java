package com.atguigu.bean;

public class Account {
    private int id;
    private String sname;
    private int balance;


    public Account() {
    }

    public Account(int id, String sname, int balance) {
        this.id = id;
        this.sname = sname;  //一定要和 sql 里面的 表头的名字对应。
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getSname() {
        return sname;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", balance=" + balance +
                '}';
    }
}
