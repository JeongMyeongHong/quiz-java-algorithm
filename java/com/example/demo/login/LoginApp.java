package com.example.demo.login;

/**
 * packageName   :   com.example.demo.login
 * fileName      :   LoginApp.java
 * author        :   JeongMyeongHong
 * date          :   2022-01-24
 * desc          :  ID, PW, Name을 받아서 출력하는 앱.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-24      JeongMyoengHong     최초 생성
 */

public class LoginApp {
    public static String LOGIN_TITLE = "----LoginApp----";
    private String id;
    private String pw;
    private String name;

    public String login(
            String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;


        return String.format("ID : %s, PW : %s, NAme : %s",this.id, this.pw, this.name);
    }
}
