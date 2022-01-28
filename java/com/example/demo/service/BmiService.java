package com.example.demo.service;

import com.example.demo.domain.BmiDTO;

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
public class BmiService {
    private double getbmi(BmiDTO bmi){
        return bmi.getWeight() * 10000 / bmi.getHeight() / bmi.getHeight();
    }
    public String getBmi(BmiDTO bmi) {
        if (getbmi(bmi) >= 25) {
            return String.format("%s 비만", bmi.getName());
        } else if (getbmi(bmi) > 23) {
            return String.format("%s 과체중", bmi.getName());
        } else if (getbmi(bmi) > 18.5) {
            return String.format("%s 정상", bmi.getName());
        } else {
            return String.format("%s 저체중", bmi.getName());
        }
    }
}
