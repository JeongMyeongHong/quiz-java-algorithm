package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.quiz.service
 * fileName      :   Feb08ServiceHJM
 * author        :   JeongMyeongHong
 * date          :   2022-02-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-09      JeongMyoengHong     최초 생성
 */
public class Feb08ServiceHJM implements Feb08Service {
    @Override
    public void lotto(Scanner scanner) {
        int[] lotto = new int[6];
        int[] answer = {4, 23, 24, 25, 34, 37};
        while (true) {
            System.out.println("0.Exit 1.로또번호 생성 2.로또번호 확인");
            switch (scanner.next()) {
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    String res = "";
                    for (int i = 0; i < lotto.length; i++) {
                        int x = (int) (Math.random() * 45 + 1);
                        lotto[i] = x;
                        for (int j = 0; j <= i; j++) {
                            if (j == i) {
                                res += lotto[i] + " ";
                            } else if (lotto[i] == lotto[j]) {
                                i--;
                                break;
                            }
                        }
                    }
                    System.out.printf("생성된 번호는 %s 입니다.\n", res);
                    break;
                case "2":
                    System.out.println("당첨 여부를 확인합니다.");
                    for(int i = 0; i< lotto.length; i++){

                    }
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }

        }

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {
        String[] name = new String[5];
        String[] phoneNum = new String[5];
        int[] howMany = new int[5];
        int[] seat = new int[100];
        for (int i = 0; i < name.length; i++) {
            name[i] = "";
            phoneNum[i] = "";
        }
        while (true) {
            System.out.println("0.시스템 종료 1.예약하기 2.예약확인");
            switch (scanner.next()) {
                case "0":
                    System.out.println("시스템을 종료합니다.");
                    return;
                case "1":
                    System.out.println("예약하기\n" +
                            "이름, 전화번호, 인원수를 입력해주세요.");
                    for (int i = 0; i < name.length; i++) {
                        if (name[i].equals("")) {
                            name[i] = scanner.next();
                            phoneNum[i] = scanner.next();
                            howMany[i] = scanner.nextInt();
                            for (int j = 0; j < howMany[i]; j++) {
                                System.out.println(j + 1 + "번 좌석의 번호를 입력해주세요.(1~100)");
                                int seatNum = scanner.nextInt() - 1;
                                if (seat[seatNum] == 0) {
                                    seat[seatNum] = i + 1;
                                } else {
                                    System.out.println("이미 선택된 좌석입니다.");
                                    j--;
                                }
                            }
                            System.out.println("당신의 예약 번호는 " + (i + 1) + "번 입니다.");
                            break;
                        } else if (i == name.length - 1) {
                            System.out.println("빈 자리가 없습니다.");
                        }
                    }

                    break;
                case "2":
                    System.out.println("예약확인\n" +
                            "부여된 예약번호를 입력해주세요");
                    String res = "";
                    int inputNum = scanner.nextInt() - 1;
                    for (int i = 0; i < seat.length; i++) {
                        if (seat[i] == (inputNum + 1)) {
                            res += String.format(" %d", i + 1);
                        }
                    }
                    System.out.printf("예약된 이름 : %s\n" +
                                    "예약된 번호 : %s\n" +
                                    "예약된 인원 : %d\n" +
                                    "예약된 좌석 : %s 입니다.%n\n",
                            name[inputNum], phoneNum[inputNum], howMany[inputNum], res);
                    break;
                default:
                    System.out.println("잘못된 번호입니다. 다시 눌러주세요.");
            }
        }

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
