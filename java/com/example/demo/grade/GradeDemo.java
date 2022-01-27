package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.grade
 * fileName      :   GradeDemo
 * author        :   JeongMyeongHong
 * date          :   2022-01-26
 * desc          :  GradeApp을 실행하는 컨트롤러.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-26      JeongMyoengHong     최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();
        System.out.println(GradeApp.GRADE_TITLE + " 앱 입니다.");

        for(int i = 1; i < 3; i++){
            System.out.println(i + "번 학생 이름을 입력해주세요.");
            String name = scanner.next();
            System.out.println("국어점수를 입력해주세요.");
            int score_kr = scanner.nextInt();
            System.out.println("영어점수를 입력해주세요.");
            int score_en = scanner.nextInt();
            System.out.println("수학점수를 입력해주세요.");
            int score_math = scanner.nextInt();
            System.out.println(gradeApp.getgrade(name, score_kr, score_en, score_math));
        }
    }
}
