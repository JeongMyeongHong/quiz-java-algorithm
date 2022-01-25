package com.example.demo.kakao;

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
