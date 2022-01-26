package com.example.demo.grade2;

import com.example.demo.grade.GradeApp;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.grade2
 * fileName      :   GradeDemo2
 * author        :   JeongMyeongHong
 * date          :   2022-01-26
 * desc          :  GradeDemo에서와는 다르게 getname을 사용해 private한 변수들 호출.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-26      JeongMyoengHong     최초 생성
 */
public class GradeDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp2 gradeApp2 = new GradeApp2();

        System.out.println(GradeApp2.GRADE_TITLE + " 앱 입니다.");
        System.out.println("이름을 입력해주세요.");
        String name = scanner.next();
        System.out.println("국어점수를 입력해주세요.");
        int score_kr = scanner.nextInt();
        System.out.println("영어점수를 입력해주세요.");
        int score_en = scanner.nextInt();
        System.out.println("수학점수를 입력해주세요.");
        int score_math = scanner.nextInt();

        gradeApp2.setgrade(name, score_kr, score_en, score_math);

        String res = String.format(" * ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d점 \n" +
                        " * > 영어: %d점 \n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점 \n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################",
                GradeApp2.GRADE_TITLE, gradeApp2.getName(), gradeApp2.getscore_kr(), gradeApp2.getscore_en(), gradeApp2.getscore_math(), gradeApp2.gettotal(), gradeApp2.getavg(), gradeApp2.getgrade());
        System.out.println(res);
    }
}
