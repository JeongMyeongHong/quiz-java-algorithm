package com.example.demo.feb07;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName   :   com.example.demo.service
 * fileName      :   Feb07ServiceImpl
 * author        :   JeongMyeongHong
 * date          :   2022-02-07
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-07      JeongMyoengHong     최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {
    @Override

    public void dice(Scanner scanner) {
        int answer = (int) (Math.random() * 6);
        int input = 0;
        while (true) {
            System.out.println("1과 6사이 값을 입력하세요");
            int dice = (int) (Math.random() * 6 + 1);
            input = scanner.nextInt();
            if (input == answer) {
                System.out.println("주사위 : " + dice);
                System.out.println("정답입니다.");
            } else if (input != answer) {
                System.out.println("주사위 : " + dice);
                System.out.println("오답입니다.");
            }
        }
    }
/*
                System.out.println("===주사위게임===");
        int num = (int) (Math.random() * 6) + 1;
        int numCom = (int) (Math.random() * 6) + 1;

        System.out.println("유저의 주사위는 " + num + "입니다.");
        System.out.println("시스템의 주사위는 "+numCom + "입니다.");

        if (num == numCom) {
            System.out.println("무승부");
        } else if (num > numCom) {
            System.out.println("유저승리");
        }else{
            System.out.println("시스템승리");
        }

 */

    @Override
    public void rps(Scanner scanner) {
        int user = 0;
        int com = (int)(Math.random()*3);
        System.out.println("가위바위보 게임");
        System.out.println("0.가위 1.바위 2.보 선택");
        user = scanner.nextInt();
        String[] str ={"가위","바위","보"};
        System.out.println("컴퓨터 : "+str[com]+", 사용자 : "+str[user]);
        switch (com-user){
            case 1: case -2:
                System.out.println("컴퓨터 승");break;
            case 2: case -1:
                System.out.println("사용자 승");break;
            default:
                System.out.println("비김");break;
        }

        /*System.out.println("===가위바위보===");
        System.out.println("1. 가위 2. 바위 3. 보");
        int inpunNum = scanner.nextInt();
        int num = (int) (Math.random() * 3) + 1;
        /*
        1 - 2패 3승
        2 - 3패 1승
        3 - 1패 2승
         */


    }

    @Override
    public void getPrime(Scanner scanner) {
        System.out.println("===소수 구하기===\n 두개의 숫자를 입력해주세요.");
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        String res = "";
        if (no1 < no2) {
            int temp = no1;
            no1 = no2;
            no2 = temp;
        }

        for (int i = no2; i < no1; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    res += String.format("%d ", i);
                } else if (i % j == 0) {
                    break;
                }
            }
        }
        System.out.println(String.format("%d와 %d 사이의 소수는 %s 입니다.", no2, no1, res));
    }

    @Override
    public void leapYear(Scanner scanner) {
        System.out.println("===윤년평년 판단===");
        System.out.println("년도를 입력해주세요");
        int s = scanner.nextInt();
        if (s % 4 == 0 && s % 100 != 0 || s % 400 == 0) {
            System.out.println(s + "년은 윤년이다.");
        } else {
            System.out.println(s + "년은 평년이다.");
        }
    }

    @Override
    public void numberGolf(Scanner scanner) {
        Random random = new Random();
        System.out.println("숫자 맞추기 게임");
        int num = random.nextInt(100) + 1;
        while (true) {
            int value = scanner.nextInt();
            if (num == value) {
                System.out.println("정답 입니다.");
                break;
            } else if (num < value) {
                System.out.println("정답이 아닙니다. 난수가 더 작습니다.");
            } else {
                System.out.println("정답이 아닙니다. 난수가 더 큽니다");
            }
        }
    }
}
