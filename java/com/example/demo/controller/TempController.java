package com.example.demo.controller;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.controller
 * fileName      :   TempController
 * author        :   JeongMyeongHong
 * date          :   2022-02-03
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-03      JeongMyoengHong     최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] four = new String[5];

        four[0] = "홍정명";
        four[1] = "노홍주";
        four[2] = "양정오";
        four[3] = "전종현";
        four[4] = "정경준";

        for (int i = 0; i< four.length; i++){
            System.out.println(four[i]);
        }

    }
}
