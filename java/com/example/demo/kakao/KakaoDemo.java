package com.example.demo.kakao;

/**
 * packageName   :   com.example.demo.kakao
 * fileName      :   KakaoDemo.java
 * author        :   JeongMyeongHong
 * date          :   2022-01-24
 * desc          :  KakaoApp을 실행하는 컨트롤러
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-24      JeongMyoengHong     최초 생성
 */

import java.util.Scanner;

public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoApp kakaoApp = new KakaoApp();
        System.out.println(KakaoApp.KAKAO_TITLE);
        System.out.println("전화번호 입력 : ");
        System.out.println("메시지 입력 : ");
        String telno = scanner.next();
        String message = scanner.next();

        System.out.println(kakaoApp.kakaoapp(telno, message));
    }
}
