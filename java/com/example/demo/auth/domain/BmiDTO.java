package com.example.demo.auth.domain;

/**
 * packageName   :   com.example.demo.bmi
 * fileName      :   BmiApp
 * author        :   JeongMyeongHong
 * date          :   2022-01-25
 * desc          :   키와 몸무게를 입력받아 bmi를 반환하는 앱.
 * variable      :   [클래스변수] :  BMITITLE
 * [인스턴스변수]: length, weight
 * [파라미터] :   length, weight
 * [로컬변수] :   res
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-25      JeongMyoengHong     최초 생성
 */
public class BmiDTO {
    public static String BMITITLE = "====BMI APP====";

    private BmiDTO(){}

    private final static BmiDTO bmiDTO = new BmiDTO();

    public static BmiDTO getInstance(){
        return bmiDTO;
    }

    private String name;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
