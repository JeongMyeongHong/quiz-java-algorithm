package com.example.demo.controller;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.algorithm
 * fileName      :   algorithmController
 * author        :   JeongMyeongHong
 * date          :   2022-01-27
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-27      JeongMyoengHong     최초 생성
 */
public class algorithmController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[MENU] 0.EXIT\n" +
                    "[홍정명] 1. dfs \t" +
                    "2. bfs \t" +
                    "3. stack \t" +
                    "4. queue \n" +
                    "[노홍주] 5. sort \t" +
                    "6. heap \n" +
                    "[양정오] 7. bin search \t" +
                    "8. graph \n" +
                    "[전종현] 9. hash \t" +
                    "10. greedy \n" +
                    "[정경준] 11. brute force \t" +
                    "12. dp");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    break;
                default:
                    System.out.println("Wrong Number");
            }
        }
    }
}
