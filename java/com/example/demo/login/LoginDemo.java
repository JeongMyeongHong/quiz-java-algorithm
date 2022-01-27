package com.example.demo.login;

/**
 * packageName   :   com.example.demo.login
 * fileName      :   LoginDemo.java
 * author        :   JeongMyeongHong
 * date          :   2022-01-24
 * desc          :   LoginApp을 실행하는 컨트롤러.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-24      JeongMyoengHong     최초 생성
 */


public class LoginDemo {
    public String execute(String id, String pw, String name) {
        LoginApp loginApp = new LoginApp();
        return loginApp.login(id, pw, name);
    }
}
