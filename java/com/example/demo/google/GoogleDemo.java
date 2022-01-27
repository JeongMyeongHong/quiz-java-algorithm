package com.example.demo.google;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * packageName   :   com.example.demo.google
 * fileName      :   GoogleDemo
 * author        :   JeongMyeongHong
 * date          :   2022-01-25
 * desc          :  GoogleApp을 실행하는 컨트롤러.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-25      JeongMyoengHong     최초 생성
 */
public class GoogleDemo {
    public String execute(String inputword) {
        GoogleApp googleApp = new GoogleApp();
        return googleApp.search(inputword);
    }
}
