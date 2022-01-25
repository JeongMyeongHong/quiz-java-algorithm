package com.example.demo.kakao;

import java.util.Scanner;

/*
 *전화번호와 메시지를 받아서 전송하는 어플을 만드시오
 * String telno, String message
 * */
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
