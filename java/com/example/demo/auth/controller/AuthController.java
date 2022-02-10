package com.example.demo.auth.controller;

import com.example.demo.auth.domain.BmiDTO;
import com.example.demo.auth.domain.CalcDTO;
import com.example.demo.auth.domain.GoogleDTO;
import com.example.demo.auth.domain.GradeDTO;
import com.example.demo.auth.domain.UserDTO;
import com.example.demo.auth.service.MemberService;
import com.example.demo.auth.service.MemberServiceImpl;

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
public class AuthController {
    public void excute(Scanner scanner) {
        GradeDTO[] grades;
        MemberService memberService = new MemberServiceImpl();

        String res = "";

        while (true) {
            System.out.println("[서브메뉴]\n메뉴를 선택하세요.");
            System.out.println("0. 앱 종료. 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN");

            switch (scanner.nextInt()) {
                case 0:
                    System.out.println("앱 종료.");
                    return;
                case 1:
                    System.out.println(BmiDTO.BMITITLE + "\n이름, 키, 몸무게 입력");
                    BmiDTO bmi = BmiDTO.getInstance();
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextInt());
                    bmi.setWeight(scanner.nextInt());
                    res = memberService.getBmi(bmi);
                    break;
                case 2:
                    System.out.println(CalcDTO.CLAC_TITLE + "\n숫자1, 연산자, 숫자2 입력");
                    CalcDTO calc = CalcDTO.getInstance();
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = memberService.calc(calc);
                    break;
                case 3:
                    System.out.println(GoogleDTO.GOOGLETITLE + "\n검색어 입력");
                    GoogleDTO google = GoogleDTO.googleDTO();
                    google.setSearchedword(scanner.next());
                    res = memberService.search(google);
                    break;
                case 4:
                    System.out.print(GradeDTO.GRADE_TITLE + " 앱 입니다.\n학생수 입력 : ");
                    grades = new GradeDTO[scanner.nextInt()];
                    for (int i = 0; i < grades.length; i++) {
                        System.out.println("이름, 국어, 영어, 수학 점수를 입력해주세요.");
                        grades[i] = GradeDTO.getInstance();
                        grades[i].setName(scanner.next());
                        grades[i].setKr(scanner.nextInt());
                        grades[i].setEn(scanner.nextInt());
                        grades[i].setMath(scanner.nextInt());
                    }
                    res = memberService.getGrade(grades);
                    break;
                case 5:
                    System.out.println(UserDTO.LOGIN_TITLE + " 앱 입니다. ID, PW, 이름을 입력해주세요.");
                    UserDTO u = UserDTO.getInstance();
                    u.setId(scanner.next());
                    u.setPw(scanner.next());
                    u.setName(scanner.next());
                    res = memberService.login(u);
                    break;
                default:
                    System.out.println("0~5를 입력해주세요.");
            }
            System.out.println(res);
        }
    }
}
