package com.example.demo.auth.domain;

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
public class CalcDTO {

    public static String CLAC_TITLE = "====계산기====";
    private final static CalcDTO calcDTO = new CalcDTO();
    private CalcDTO(){}
    public static CalcDTO getInstance(){
        return calcDTO;
    }
    private int num1;
    private int num2;
    private String opcode;


    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public String getOpcode(){
        return opcode;
    }
    public void setOpcode(String opcode){
        this.opcode = opcode;
    }

}
