package com.example.demo.quiz.service;

/**
 * packageName   :   com.example.demo.quiz.service
 * fileName      :   Feb09Service
 * author        :   JeongMyeongHong
 * date          :   2022-02-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-10      JeongMyoengHong     최초 생성
 */
public interface Feb10Service {
    // 아래 문제들은 모두 스캐너 없이 , Math랜덤으로 처리합니다
    // 1번
    void bubbleSort();
    void insertionSort();
    void selectionSort();
    // 2번
    void quickSort();
    void mergeSort();
    // 3번
    void magicSquare(int num);
    // 4번
    void zigzag();
    // 5번
    // 좌측90도 직각삼각형 별찍기
    void rectangleStarPrint();
    // 정삼각형 별찍기
    void triangleStarPrint();
}
