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
    public String bmiDemo(double height, double weight) {
        BmiApp bmiApp = new BmiApp();
        return String.format("당신의 BMI 지수는 %.2f 입니다.",bmiApp.getBmi(height, weight));
    }
}
