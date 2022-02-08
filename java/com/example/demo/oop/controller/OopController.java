package com.example.demo.oop.controller;

import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo.controller
 * fileName      :   PhoneController
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public class OopController {
    public void excute(Scanner scanner) {

        PhoneService phoneService = new PhoneServiceImpl();

        while (true) {
            System.out.println("[서브메뉴]\n0. 시스템종료 1. 집전화 2. 휴대폰 3. 아이폰 4. 갤럭시노트 ");
            switch (scanner.next()) {
                case "0":
                    System.out.println("시스템 종료");
                    return;
                case "1":
                    System.out.println("집전화 입니다.");
                    phoneService.usePhone(scanner);
                    break;
                case "2":
                    System.out.println("휴대폰 입니다.");
                    phoneService.useCelPhone(scanner);
                    break;
                case "3":
                    System.out.println("아이폰 입니다.");
                    phoneService.useIPhone(scanner);
                    break;
                case "4":
                    System.out.println("갤럭시노트 입니다.");
                    phoneService.useGalPhone(scanner);
                    break;
                default:
                    System.out.println("잘못된 선택 입니다.");
            }
        }
    }
}
