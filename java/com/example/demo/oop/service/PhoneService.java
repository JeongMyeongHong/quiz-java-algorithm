package com.example.demo.oop.service;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.phone
 * fileName      :   PhoneService
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public interface PhoneService {
    void usePhone(Scanner scanner);
    void useCelPhone(Scanner scanner);
    void useIPhone(Scanner scanner);
    void useGalPhone(Scanner scanner);
}
