package com.example.demo;

import com.example.demo.oop.controller.OopController;
import com.example.demo.quiz.service.Feb08Service;
import com.example.demo.quiz.service.Feb08ServiceHJM;

import java.util.Scanner;

/**
 * packageName   :   com.example.demo
 * fileName      :   test
 * author        :   JeongMyeongHong
 * date          :   2022-02-08
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-08      JeongMyoengHong     최초 생성
 */
public class test {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
//        Feb08Service feb08Service = new Feb08ServiceHJM();
//        feb08Service.booking(scanner);
        OopController oopController = new OopController();
        oopController.excute(scanner);
    }
}
