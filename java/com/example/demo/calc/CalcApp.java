package com.example.demo.calc;

/**
 * packageName   :   com.example.demo.calc
 * fileName      :   CalcApp.java
 * author        :   JeongMyeongHong
 * date          :   2022-01-24
 * desc          :  숫자 2개와 연산자 1개를 받아서 리턴하는 앱.
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-24      JeongMyoengHong     최초 생성
 */
public class CalcApp {
    static String CLAC_TITLE = "====계산기====";
    private int num1;
    private int num2;
    private String opcode;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.opcode = opcode;

        return String.format("%d %s %d = %d",num1,opcode,num2,num1+num2);
    }
}
