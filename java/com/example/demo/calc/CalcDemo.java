package com.example.demo.calc;

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

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();

        System.out.println(CalcApp.CLAC_TITLE);
        System.out.println("첫번째 숫자");
        int num1 = scanner.nextInt();
        System.out.println("연산기호");
        String opcode = scanner.next();
        System.out.println("두번째 숫자");
        int num2 = scanner.nextInt();
        System.out.println("연산결과 : "+calcApp.calc(num1,opcode,num2));
    }
}
