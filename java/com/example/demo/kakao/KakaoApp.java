package com.example.demo.kakao;

/**
 * packageName   :   com.example.demo.kakao
 * fileName      :   KakaoApp.java
 * author        :   JeongMyeongHong
 * date          :   2022-01-24
 * desc          :  전화번호와 메시지를 받아서 전송하는 앱
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-24      JeongMyoengHong     최초 생성
 */

public class KakaoApp {
    public static String KAKAO_TITLE = "====KakaoApp====";
    private String telno;
    private String message;

    public String kakaoapp(String telno, String message){
        this.telno = telno;
        this.message = message;

        return String.format("전화번호는 : %s 이고 메시지는 '%s' 입니다.", this.telno, this.message);
    }
}
