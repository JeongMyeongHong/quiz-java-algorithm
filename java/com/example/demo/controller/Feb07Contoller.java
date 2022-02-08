package com.example.demo.controller;

import com.example.demo.service.Feb07Service;
import com.example.demo.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.controller
 * fileName      :   Feb07Contoller
 * author        :   JeongMyeongHong
 * date          :   2022-02-07
 * desc          :
 * 1. 주사위 - dice  (int)(Math.random()*6) +1
 * 2. 가위바위보 - rps
 * 3. 입력받은 두 수 사이에 있는 소수 구하기 - getPrime
 * 4. 입력받은 년도가 윤년인지 평년인지 판단하기 - leapYear
 * 5. 임의로 입력받은 숫자 맞추기 - numberGolf
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-07      JeongMyoengHong     최초 생성
 */
public class Feb07Contoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb07Service game = new Feb07ServiceImpl();
        while(true){
            System.out.println("하고 싶은 게임의 번호(1~5)를 입력해주세요.  0. 게임종료");
            switch (scanner.next()){
                case "0" :
                    System.out.println("게임 종료");
                    return;
                case "1":
                    game.dice(scanner);
                    break;
                case "2":
                    game.rps(scanner);
                    break;
                case "3":
                    game.getPrime(scanner);
                    break;
                case "4":
                    game.leapYear(scanner);
                    break;
                case "5":
                    game.numberGolf(scanner);
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
