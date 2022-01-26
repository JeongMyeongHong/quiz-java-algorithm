package com.example.demo.login;

/**
 * packageName   :   com.example.demo.login
 * fileName      :   LoginApp.java
 * author        :   JeongMyeongHong
 * date          :   2022-01-24
 * desc          :  ID, PW, Name을 받아서
 *                  PW가 PASSWORD와 일치하면 이름과 로그인 성공을 알려주고
 *                  PW가 PASSWORD와 일치하지 않으면 로그인 실패를 알려주는 앱.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-24      JeongMyoengHong     최초 생성
 */

public class LoginApp {
    public static String LOGIN_TITLE = "----LoginApp----";
    private static String PASSWORD = "abc";
    private String id;
    private String pw;
    private String name;

    public String login(
            String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        String res = "";

        if (this.pw.equals(PASSWORD)) {
            res = String.format("%s 님의 비번 %s가 맞습니다. 로그인 성공",this.name, this.pw);
        }else{
            res = String.format("%s의 ID는 맞고, 비번 %s (이)가 틀립니다. 로그인 실패",this.id, this.pw);
        }
        return res;
    }
}
