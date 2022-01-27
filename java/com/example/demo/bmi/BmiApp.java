package com.example.demo.bmi;

/**
 * packageName   :   com.example.demo.bmi
 * fileName      :   BmiApp
 * author        :   JeongMyeongHong
 * date          :   2022-01-25
 * desc          :   키와 몸무게를 입력받아 bmi를 반환하는 앱.
 * variable      :   [클래스변수] :  BMITITLE
 *                   [인스턴스변수]: length, weight
 *                   [파라미터] :   length, weight
 *                   [로컬변수] :   res
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-01-25      JeongMyoengHong     최초 생성
 */
public class BmiApp {
    public static String BMITITLE = "====BMI APP====";
    private double height;
    private double weight;
    double res;

    public double getBmi(double height, double weight){
        this.height = height;
        this.weight = weight;
        res = weight/(height*height)*10000;
        return res;
    }

    public String res(){
        String result;
        if (this.res<=18.5){
            result = "저체중입니다.";
        }
        else if(18.5<this.res && this.res<=23){
            result = "정상입니다.";
        }
        else if(23<this.res && this.res<=25){
            result = "과체중입니다.";
        }
        else{
            result = "비만입니다.";
        }
        return result;
    }

}
