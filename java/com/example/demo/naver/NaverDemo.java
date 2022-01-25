package com.example.demo.naver;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.naver
 * fileName      :   NaverDemo
 * author        :   JeongMyeongHong
 * date          :   2022-01-25
 * desc          :  NaverApp을 실행하는 컨트롤러.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-25      JeongMyoengHong     최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();

        System.out.println(NaverApp.NAVERTITLE);
        System.out.println("ID 를 입력해주세요");
        String id = scanner.next();
        System.out.println("PW 를 입력해주세요");
        String pw = scanner.next();
        System.out.println("로그인 상태 유지 0 or 1 입력");
        int logcons = scanner.nextInt();

        System.out.println(naverApp.login(id, pw, logcons));

    }
}
