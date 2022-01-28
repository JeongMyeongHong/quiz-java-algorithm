package com.example.demo.service;

import com.example.demo.domain.CalcDTO;

/**
 * packageName   :   com.example.demo.calc
 * fileName      :   CalcDemo.java
 * author        :   JeongMyeongHong
 * date          :   2022-01-24
 * desc          :  CalcApp을 실행하는 컨트롤러
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-24      JeongMyoengHong     최초 생성
 */

public class CalcService {
    public String getcalc(CalcDTO calc) {
        switch (calc.getOpcode()) {
            case "+":
                return (String.format("연산 결과는 %d 입니다.",calc.getNum1() + calc.getNum2()));
            case "-":
                return (String.format("연산 결과는 %d 입니다.",calc.getNum1() - calc.getNum2()));
            case "*":
                return (String.format("연산 결과는 %d 입니다.",calc.getNum1() * calc.getNum2()));
            case "/":
                return (String.format("연산 결과는 %d 입니다.",calc.getNum1() / calc.getNum2()));
            default:
                return "잘못된 연산자 입니다.";
        }
    }
}
