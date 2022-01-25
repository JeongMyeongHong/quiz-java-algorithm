package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.bmi
 * fileName      :   BmiDemo
 * author        :   JeongMyeongHong
 * date          :   2022-01-25
 * desc          :   BmiApp을 실행하는 컨트롤러.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-25      JeongMyoengHong     최초 생성
 */
public class BmiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();

        System.out.println(BmiApp.BMITITLE);

        System.out.println("신장을 입력해주세요");
        double height = scanner.nextDouble();
        System.out.println("몸무게를 입력해주세요");
        double weight = scanner.nextDouble();

        System.out.println(String.format("당신의 BMI 지수는 %.2f 입니다.",bmiApp.bmi(height, weight)));
        System.out.println(bmiApp.result());
    }
}
