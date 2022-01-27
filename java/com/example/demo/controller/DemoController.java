package com.example.demo.controller;

import com.example.demo.bmi.BmiApp;
import com.example.demo.bmi.BmiDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.google.GoogleApp;
import com.example.demo.google.GoogleDemo;
import com.example.demo.grade2.GradeApp2;
import com.example.demo.grade2.GradeDemo2;
import com.example.demo.login.LoginApp;
import com.example.demo.login.LoginDemo;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.controller
 * fileName      :   DemoController
 * author        :   JeongMyeongHong
 * date          :   2022-01-27
 * desc          :  Demo를 하나의 메인에서 컨트롤.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-27      JeongMyoengHong     최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDemo bmiDemo = new BmiDemo();
        CalcDemo calcDemo = new CalcDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        GradeDemo2 gradeDemo2 = new GradeDemo2();
        LoginDemo loginDemo = new LoginDemo();

        String res = "";

        while (true) {
            System.out.println("\n메뉴를 선택하세요.");
            System.out.println("0. 앱 종료. 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN");

            switch (scanner.nextInt()) {
                case 0:
                    System.out.println("앱 종료.");
                    return;
                case 1:
                    System.out.println(BmiApp.BMITITLE + "\n신장과 체중 입력");
                    res = bmiDemo.bmiDemo(scanner.nextDouble(), scanner.nextInt());
                    break;
                case 2:
                    System.out.println(CalcApp.CLAC_TITLE + "\n숫자1, 연산자, 숫자2 입력");
                    res = calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());
                    break;
                case 3:
                    System.out.println(GoogleApp.GOOGLETITLE + "\n검색어 입력");
                    res = googleDemo.execute(scanner.next());
                    break;
                case 4://GradeDemo 는 for Loop 있으니까 일단은 2로 해뒀음)
                    System.out.println(GradeApp2.GRADE_TITLE + " 앱 입니다. 이름, 국어, 영어, 수학 점수를 입력해주세요.");
                    res = gradeDemo2.execute(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case 5:
                    System.out.println(LoginApp.LOGIN_TITLE + " 앱 입니다. ID, PW, 이름을 입력해주세요.");
                    res = loginDemo.execute(scanner.next(), scanner.next(), scanner.next());
                    break;
                default:
                    System.out.println("0~5를 입력해주세요.");
                    break;
            }
            System.out.println(res);
        }
    }
}
