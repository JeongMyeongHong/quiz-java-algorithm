package com.example.demo.auth.domain;

/**
 * packageName   :   com.example.demo.login
 * fileName      :   LoginApp.java
 * author        :   JeongMyeongHong
 * date          :   2022-01-24
 * desc          :  ID, PW, Name을 받아서
 * PW가 PASSWORD와 일치하면 이름과 로그인 성공을 알려주고
 * PW가 PASSWORD와 일치하지 않으면 로그인 실패를 알려주는 앱.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-24      JeongMyoengHong     최초 생성
 * 2022-01-26      JeongMyoengHong      if 추가
 */

public class UserDTO {
    public static String LOGIN_TITLE = "----LoginApp----";

    private final static UserDTO userDTO = new UserDTO();

    private UserDTO() {}

    public static UserDTO getInstance(){
        return userDTO;
    }

    private String id;
    private String pw;
    private String name;
    public static String PASSWORD = "abc";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
