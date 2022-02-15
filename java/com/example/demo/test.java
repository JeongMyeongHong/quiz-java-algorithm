package com.example.demo;

import com.example.demo.oop.controller.OopController;
import com.example.demo.quiz.service.*;

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
//        Feb10Service feb10Service = new Feb10ServiceHJM();
//        feb10Service.bubbleSort();
        Feb07Service feb07Service = new Feb07ServiceHJM();
        feb07Service.dice(scanner);
    }
}
