package com.example.demo.oop.service;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.phone
 * fileName      :   PhoneServiceImpl
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public class PhoneServiceImpl implements PhoneService {
    @Override
    public void usePhone(Scanner scanner) {
        Phone phone = new Phone();
    }

    @Override
    public void useCelPhone(Scanner scanner) {
        CelPhone celPhone = new CelPhone();
    }

    @Override
    public void useIPhone(Scanner scanner) {
        IPhone iPhone = new IPhone();
    }

    @Override
    public void useGalPhone(Scanner scanner) {
        GalPhone galPhone = new GalPhone();
    }
}
