package com.example.demo.quiz.controller;

import com.example.demo.quiz.domain.TeamDTO;
import com.example.demo.quiz.service.*;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.quiz.controller
 * fileName      :   QuizController
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public class QuizController {
    public void excute(Scanner scanner) {
        Feb06Service feb06Service = new Feb06ServiceImpl();
        TeamDTO team = new TeamDTO();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();

        while (true) {
            System.out.println("[서브메뉴]\n0.Exit 1.Feb06 2.Feb07 3.Feb08 4.Feb10");
            switch (scanner.next()) {
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    System.out.println("[소메뉴]\n0.시스템종료 1.팀별과제 2.팀장이 맡은 과제 3.담당인원 4.과제수 5.과제수2 6.열갯수");
                    switch (scanner.next()) {
                        case "0":
                            return;
                        case "1":
                            feb06Service.quiz1(team);
                            break;
                        case "2":
                            feb06Service.quiz2(team);
                            break;
                        case "3":
                            feb06Service.quiz3(team);
                            break;
                        case "4":
                            feb06Service.quiz4(team);
                            break;
                        case "5":
                            feb06Service.quiz5(team);
                            break;
                        case "6":
                            feb06Service.quiz6(team);
                            break;
                        default:
                            System.out.println("잘못된 번호 입력");
                    }
                    break;
                case "2":
                    System.out.println("[소메뉴]\n0. 게임종료\t1. 주사위게임\t2. 가위바위보\t3. 소수찾기\t4. 윤년판단\t5. 숫자맞추기");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("게임 종료");
                            return;
                        case "1":
                            feb07Service.dice(scanner);
                            break;
                        case "2":
                            feb07Service.rps(scanner);
                            break;
                        case "3":
                            feb07Service.getPrime(scanner);
                            break;
                        case "4":
                            feb07Service.leapYear(scanner);
                            break;
                        case "5":
                            feb07Service.numberGolf(scanner);
                            break;
                        default:
                            System.out.println("잘못된 선택입니다.");
                    }
                    break;
                case "3":
                    System.out.println("[소메뉴]\n0.시스템종료 1.로또 2.야구 3.예약 4.은행 5.구구단");
                    switch (scanner.next()) {
                        case "0":
                            return;
                        case "1":
                            feb08Service.lotto(scanner);
                            break;
                        case "2":
                            feb08Service.baseball(scanner);
                            break;
                        case "3":
                            feb08Service.booking(scanner);
                            break;
                        case "4":
                            feb08Service.bank(scanner);
                            break;
                        case "5":
                            feb08Service.gugudan(scanner);
                            break;
                        default:
                            System.out.println("잘못된 번호 입력");
                    }

                    break;
                case "4":
                    System.out.println("[소메뉴]\n0.시스템종료 1.bubbleSort 2.insertionSort" +
                            " 3.selectionSort 4.quickSort 5.mergeSort 6.magicSquare 7.zigzag" +
                            " 8.rectangleStarPrint 9.triangleStarPrint ");
                    Feb10Service feb10Service = new Feb10ServiceImpl();
                    switch (scanner.next()){
                        case "1":
                            feb10Service.bubbleSort();
                            break;
                        case "2":
                            feb10Service.insertionSort();
                            break;
                        case "3":
                            feb10Service.selectionSort();
                            break;
                        case "4":
                            feb10Service.quickSort();
                            break;
                        case "5":
                            feb10Service.mergeSort();
                            break;
                        case "6":
                            //feb10Service.magicSquare();
                            break;
                        case "7":
                            feb10Service.zigzag();
                            break;
                        case "8":
                            feb10Service.rectangleStarPrint();
                            break;
                        case "9":
                            feb10Service.triangleStarPrint();
                            break;
                        default:
                            System.out.println("잘못된 선택입니다.");
                    }
                default:
                    System.out.println("Wrong Number");
            }
        }
    }
}
