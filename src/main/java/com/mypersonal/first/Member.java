package com.mypersonal.first;

public class Member {
    private int id;
    public String memberName;
    public String password;

    public static int counter = 1;

    public Member() {
        this.id = counter++;
    }

    public Member(int id, String memberName, String password) {
        this.id = id;
        this.memberName = memberName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Member.counter = counter;
    }
}
