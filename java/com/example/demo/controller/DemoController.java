package com.example.demo.controller;

import com.example.demo.domain.BmiDTO;
import com.example.demo.service.BmiService;
import com.example.demo.domain.CalcDTO;
import com.example.demo.service.CalcService;
import com.example.demo.domain.GoogleDTO;
import com.example.demo.service.GoogleService;
import com.example.demo.domain.GradeDTO;
import com.example.demo.service.GradeService;
import com.example.demo.domain.LoginDTO;
import com.example.demo.service.LoginService;

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
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();
        BmiService bmiService = new BmiService();
        CalcService calcService = new CalcService();
        GoogleService googleService = new GoogleService();
        GradeService gradeService = new GradeService();
        LoginService loginService = new LoginService();

        String res = "";

        while (true) {
            System.out.println("\n메뉴를 선택하세요.");
            System.out.println("0. 앱 종료. 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN");

            switch (scanner.nextInt()) {
                case 0:
                    System.out.println("앱 종료.");
                    return;
                case 1:
                    System.out.println(BmiDTO.BMITITLE + "\n이름, 키, 몸무게 입력");
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextInt());
                    bmi.setWeight(scanner.nextInt());
                    res = bmiService.getBmi(bmi);
                    break;
                case 2:
                    System.out.println(CalcDTO.CLAC_TITLE + "\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.getcalc(calc);
                    break;
                case 3:
                    System.out.println(GoogleDTO.GOOGLETITLE + "\n검색어 입력");
                    google.setSearchedword(scanner.next());
                    res = googleService.getgoogle(google);
                    break;
                case 4:
                    System.out.println(GradeDTO.GRADE_TITLE + " 앱 입니다. 이름, 국어, 영어, 수학 점수를 입력해주세요.");
                    grade.setName(scanner.next());
                    grade.setKr(scanner.nextInt());
                    grade.setEn(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = gradeService.getgrade(grade);
                    break;
                case 5:
                    System.out.println(LoginDTO.LOGIN_TITLE + " 앱 입니다. ID, PW, 이름을 입력해주세요.");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = loginService.getlogin(login);
                    break;
                default:
                    System.out.println("0~5를 입력해주세요.");
            }
            System.out.println(res);
        }
    }
}
